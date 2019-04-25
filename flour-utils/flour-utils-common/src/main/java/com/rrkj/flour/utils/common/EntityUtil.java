/**
 * 文件名：EntityUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2017年5月22日 上午10:30:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.lang.reflect.Field;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2017年5月22日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class EntityUtil {

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2017年5月22日
	 * @author: suhs - jinisu@163.com
	 * @update: 2017年5月22日 上午10:40:56  suhs
	 */
	@SuppressWarnings("unchecked")
	public static <T> T fillValue(Class<T> clazz, Object src) {
		if (src == null) {
			return null;
		}
		// TODO
		Object res = null;
		try {
			res = clazz.getDeclaredConstructor().newInstance();
			fillValue(res, src);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) res;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2017年5月22日
	 * @author: suhs - jinisu@163.com
	 * @update: 2017年5月22日 上午10:41:03  suhs
	 */
	public static void fillValue(Object dest, Object src) {
		// 当成普通的对象处理
		// 只处理obj为Map的格式
		Class<?> type = dest.getClass();
		Field[] fs = type.getDeclaredFields();
		if (fs != null && fs.length > 0 && dest != null) {
			for (Field field : fs) {
				try {
					String name = field.getName();
					//
					Field srcField = src.getClass().getDeclaredField(name);
					srcField.setAccessible(true);
					if (srcField != null) {
						field.setAccessible(true);
						//
						field.set(dest, ReflectUtil.simpleArgumentAdaptation(field.getType(), srcField.get(src)));
					} else {

					}
				} catch (Exception e) {
				}
			}
		}
	}
}
