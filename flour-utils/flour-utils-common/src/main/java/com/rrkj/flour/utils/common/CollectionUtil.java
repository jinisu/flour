/**
 * 文件名：CollectionUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2015年10月23日 上午9:33:45
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2015年10月23日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class CollectionUtil {

	public static <T> List<T> newEmptyList() {
		return new ArrayList<T>();
	}

	public static <T> List<T> newArrayList(@SuppressWarnings("unchecked") T... t) {
		List<T> list = new ArrayList<T>();
		for (T i : t) {
			list.add(i);
		}
		return list;
	}
}
