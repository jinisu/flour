/**
 * 文件名：Pair.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月4日 上午8:29:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月4日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class Pair<T, P> {

	public T first;

	public P second;

	public Pair() {
	}

	public Pair(T first, P second) {
		this.first = first;
		this.second = second;
	}

}
