/**
 * 文件名：MapUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2015年10月19日 上午8:22:50
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.util.Map;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月4日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class MapUtil {

	/**
	 * 
	 * <p>
	 * Description:[方法功能中文描述]
	 * </p>
	 * Created on 2015年10月19日
	 * 
	 * @author: suhs - jinisu@163.com
	 * @update: 2015年10月19日 上午8:24:21 suhs
	 */
	public static String getStringValue(final Map<Object, Object> map, final Object key) {
		Object value = map.get(key);
		return value == null ? "" : value.toString();
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月8日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月8日 下午1:17:33  suhs
	 */
	public static int getIntegerValue(final Map<Object, Object> map, final Object key) {
		Object value = map.get(key);
		if (value == null) {
			return 0;
		}
		if (value instanceof String) {
			try {
				String s = value.toString().replaceAll(" ", "").trim();
				return Integer.valueOf(s);
			} catch (Exception e) {
				try {
					String s = value.toString().replaceAll("[^0-9.]", "").trim();
					return Integer.valueOf(s);
				} catch (Exception e2) {
				}
			}
		}
		if (value instanceof Number) {
			return ((Number) value).intValue();
		}
		return 0;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月8日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月8日 下午1:17:38  suhs
	 */
	public static float getFloatValue(final Map<Object, Object> map, final Object key) {
		Object value = map.get(key);
		if (value == "") {
			return 0;
		}
		if (value instanceof String) {
			try {
				String s = value.toString().replaceAll(" ", "").trim();
				return Float.parseFloat(s);
			} catch (Exception e) {
				try {
					String s = value.toString().replaceAll("[^0-9.]", "").trim();
					return Float.parseFloat(s);
				} catch (Exception e2) {
				}
			}
		}
		if (value instanceof Number) {
			return ((Number) value).floatValue();
		}
		return 0;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2016年8月8日
	 * @author: suhs - jinisu@163.com
	 * @update: 2016年8月8日 下午1:17:42  suhs
	 */
	public static Object getObjectFromPath(Map<String, Object> map, String path) {
		if (map == null || StringUtil.isEmpty(path)) {
			return null;
		}
		String[] paths = path.split("\\.");
		if (paths == null || paths.length <= 0) {
			return null;
		}
		Object res = map;
		for (String keyTemp : paths) {
			if (res instanceof Map) {
				res = map.get(keyTemp);
			} else {
				return null;
			}
		}
		return res;
	}

	public static int getIntegerValue(Map<String, Object> map, String key) {
		Object value = map.get(key);
		if (value == null) {
			return 0;
		}
		if (value instanceof String) {
			try {
				String s = value.toString().replaceAll(" ", "").trim();
				return Integer.valueOf(s);
			} catch (Exception e) {
				try {
					String s = value.toString().replaceAll("[^0-9.]", "").trim();
					return Integer.valueOf(s);
				} catch (Exception e2) {
				}
			}
		}
		if (value instanceof Number) {
			return ((Number) value).intValue();
		}
		return 0;
	}

	public static Float getFloatValue(Map<String, Object> map, String key) {
		Object value = map.get(key);
		if (value == "") {
			return 0f;
		}
		if (value instanceof String) {
			try {
				String s = value.toString().replaceAll(" ", "").trim();
				return Float.parseFloat(s);
			} catch (Exception e) {
				try {
					String s = value.toString().replaceAll("[^0-9.]", "").trim();
					return Float.parseFloat(s);
				} catch (Exception e2) {
				}
			}
		}
		if (value instanceof Number) {
			return ((Number) value).floatValue();
		}
		return 0f;
	}

	public static String getStringValue(Map<String, Object> map, String key) {
		Object value = map.get(key);
		return value == null ? "" : value.toString();
	}
}
