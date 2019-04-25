/**
 * 文件名：ReflectUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月1日 下午3:20:35
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月1日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class ReflectUtil {

	private static final Logger logger = LoggerFactory.getLogger(ReflectUtil.class);

	public static Object getObjectFromPath(Object obj, String path) {
		if (obj == null) {
			return null;
		}
		if (StringUtil.isEmpty(path)) {
			return obj;
		}
		if (path.indexOf(".") > 0) {
			// 有嵌套
			String pre = path.substring(0, path.indexOf("."));
			String oth = path.substring(path.indexOf(".") + 1);
			return getObjectFromPath(getObjectFromPath(obj, pre), oth);
		}
		if (path.indexOf(".") == 0) {
			return getObjectFromPath(obj, path.substring(1));
		}
		if (obj instanceof Map) {
			return ((Map) obj).get(path);
		}
		if (obj instanceof Number) {
			return obj;
		}
		if (obj instanceof String) {
			return obj;
		}
		if (obj instanceof Boolean) {
			return obj;
		}
		if (obj instanceof List) {
			List list = (List) obj;
			try {
				if (list.size() <= 0) {
					return null;
				}
				int index = Integer.valueOf(path);
				if (index < list.size()) {
					return list.get(index);
				}
				return list.get(0);
			} catch (Exception e) {
			}
		}
		return queryValue(path, obj);
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月2日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月2日 上午8:19:52  suhs
	 */
	public static Object getDefaultValue(Class<?> type) {
		if (type.equals(String.class)) {
			// 字符串
			return "";
		} else if (type.equals(Integer.class) || type.equals(int.class)) {
			// 整数
			return 0;
		} else if (type.equals(Long.class) || type.equals(long.class)) {
			// 长整数
			return 0L;
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			// 浮点数
			return 0F;
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			// double
			return 0D;
		} else if (type.equals(Short.class) || type.equals(short.class)) {
			// Short
			return 0;
		} else if (type.equals(Date.class)) {
			return new Date();
		}
		return null;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月2日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月2日 上午8:00:27  suhs
	 */
	public static Object queryValue(String fieldName, Object obj) {
		if (obj == null || StringUtil.isEmpty(fieldName)) {
			return null;
		}
		if (obj instanceof Map) {
			return ((Map) obj).get(fieldName);
		}
		try {
			Field field = obj.getClass().getDeclaredField(fieldName);
			if (field != null) {
				field.setAccessible(true);
				return field.get(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月1日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月1日 下午3:33:39  suhs
	 */
	public static void simpleSetFieldValue(Field field, Object target, Object value) throws Exception {
		if (field == null || target == null) {
			return;
		}
		boolean o = field.isAccessible();
		field.setAccessible(true);
		try {
			// 类型匹配
			if (target.getClass().isInstance(value)) {
				field.set(target, value);
				return;
			}
			field.set(target, simpleArgumentAdaptation(target.getClass(), value));
		} catch (Exception e) {
			throw e;
		} finally {
			field.setAccessible(o);
		}
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月1日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月1日 下午3:33:43  suhs
	 */
	public static void setFieldValue(Field field, Object target, Object value) throws Exception {
		if (field == null || target == null) {
			return;
		}
		boolean o = field.isAccessible();
		field.setAccessible(true);
		try {
			// 类型匹配
			if (target.getClass().isInstance(value)) {
				field.set(target, value);
				return;
			}
			if (value == null) {
				field.set(target, getDefaultValue(field.getType()));
				return;
			}
			field.set(target, argumentAdaptation(field.getType(), value));
		} catch (Exception e) {
			throw e;
		} finally {
			field.setAccessible(o);
		}

	}

	public static Object simpleArgumentAdaptation(Class<?> type, Object obj) {
		if (obj == null) {
			return getDefaultValue(type);
		}
		if (type.equals(String.class)) {
			// 字符串
			return obj.toString();
		} else if (type.equals(Integer.class) || type.equals(int.class)) {
			// 整数
			String vi = obj.toString();
			return Integer.valueOf(vi);
		} else if (type.equals(Long.class) || type.equals(long.class)) {
			// 长整数
			String vi = obj.toString();
			return Long.valueOf(vi);
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			// 浮点数
			String vi = obj.toString();
			return Float.valueOf(vi);
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			// double
			String vi = obj.toString();
			return Double.valueOf(vi);
		} else if (type.equals(Short.class) || type.equals(short.class)) {
			// Short
			String vi = obj.toString();
			return Short.valueOf(vi);
		} else if (type.equals(Date.class)) {
			// TODO
		}
		return obj;
	}

	/**
	 * 
	 * <p>Description:[参数与目标方法的适配]</p>
	 * Created on 2016年7月25日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年7月25日 下午12:53:12  suhs
	 */
	public static Object[] argsAdaptation(Class<?>[] argsTypes, Object[] args) {
		// 无参数直接返回
		if (argsTypes == null || argsTypes.length <= 0) {
			return new Object[] {};
		}
		// 创建返回
		Object[] res = new Object[argsTypes.length];
		for (int i = 0; i < argsTypes.length; i++) {
			Class<?> clazz = argsTypes[i];
			// 判断是否有参数
			if (args != null && args.length > i) {
				Object v = args[i];
				if (clazz.isInstance(v)) {
					// 如果参数的类型匹配
					res[i] = v;
				} else {
					// 参数的类型不匹配
					// 需要进行一定的转换
					try {
						res[i] = argumentAdaptation(clazz, v);
					} catch (Exception e) {
						res[i] = ReflectUtil.getDefaultValue(clazz);
						if (v != null) {
							logger.error(String.format("参数转变错误!需要参数类型%s,实际参数类型%s,参数值:%s", clazz.getName(),
									v.getClass().getName(), v.toString()));
						} else {
							logger.error(
									String.format("参数转变错误!需要参数类型%s,实际参数类型%s,参数值:%s", clazz.getName(), "null", "null"));
						}

					}

				}
			} else {
				// 没有参数设置参数默认值
				res[i] = ReflectUtil.getDefaultValue(clazz);
			}
		}
		return res;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月2日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月2日 上午8:32:55  suhs
	 */
	public static Object argumentAdaptation(Class<?> type, Object obj) {
		if (obj == null) {
			return getDefaultValue(type);
		}

		if (type.equals(String.class)) {
			// 字符串
			return obj.toString();
		} else if (type.equals(Integer.class) || type.equals(int.class)) {
			// 整数
			String vi = obj.toString();
			return Integer.valueOf(vi);
		} else if (type.equals(Long.class) || type.equals(long.class)) {
			// 长整数
			String vi = obj.toString();
			return Long.valueOf(vi);
		} else if (type.equals(Float.class) || type.equals(float.class)) {
			// 浮点数
			String vi = obj.toString();
			return Float.valueOf(vi);
		} else if (type.equals(Double.class) || type.equals(double.class)) {
			// double
			String vi = obj.toString();
			return Double.valueOf(vi);
		} else if (type.equals(Short.class) || type.equals(short.class)) {
			// Short
			String vi = obj.toString();
			return Short.valueOf(vi);
		} else if (type.equals(Map.class) || Map.class.isAssignableFrom(type)) {
			// Map
			Map<Object, Object> res = null;
			if (type.isInterface()) {
				res = new HashMap<>();
			} else {
				try {
					res = (Map<Object, Object>) type.getDeclaredConstructor().newInstance();
				} catch (Exception e) {
					res = new HashMap<>();
				}
			}
			// 判断object的类型
			if (obj instanceof Map) {
				res.putAll((Map) obj);
				return res;
			} else {
				Field[] fs = obj.getClass().getFields();
				if (fs != null && fs.length > 0) {
					for (Field field : fs) {
						try {
							res.put(field.getName(), field.get(obj));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else {
					return res;
				}
			}
		} else if (type.isArray()) {
			// 数组
			if (obj.getClass().isArray()) {
				return obj;
			}
			if (obj instanceof List) {
				List<?> o = (List<?>) obj;
				return o.toArray();
			}
			if (obj instanceof Set) {
				Set<?> o = (Set<?>) obj;
				return o.toArray();
			}
		} else if (type.equals(List.class) || List.class.isAssignableFrom(type)) {
			// List
			if (obj instanceof Set) {
				return obj;
			}
			if (obj.getClass().isArray()) {
				return Arrays.asList((Object[]) obj);
			}
			if (obj instanceof Set) {
				Set<?> o = (Set<?>) obj;
				List res = new ArrayList<>();
				o.forEach((e) -> {
					res.add(e);
				});
			}
		} else if (type.equals(Set.class) || Set.class.isAssignableFrom(type)) {
			// set
			if (obj instanceof Set) {
				return obj;
			}
			Set res = new HashSet<>();
			if (obj.getClass().isArray()) {
				for (Object t : (Object[]) obj) {
					res.add(t);
				}
			}
			if (obj instanceof List) {
				List<?> o = (List<?>) obj;
				o.forEach((e) -> {
					res.add(e);
				});
			}
		} else {
			// 当成普通的对象处理
			// 只处理obj为Map的格式
			if (obj instanceof Map) {
				Object res = null;
				try {
					res = type.getDeclaredConstructor().newInstance();
				} catch (Exception e1) {
					e1.printStackTrace();
				}

				Field[] fs = type.getDeclaredFields();
				if (fs != null && fs.length > 0 && res != null) {
					for (Field field : fs) {
						try {
							String name = field.getName();
							Object v = ((Map) obj).get(name);
							if (v != null) {
								field.setAccessible(true);
								//
								field.set(res, simpleArgumentAdaptation(field.getType(), v));
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} else {
					// 没有字段
					return null;
				}
				return res;
			}
		}
		return obj;
	}
}
