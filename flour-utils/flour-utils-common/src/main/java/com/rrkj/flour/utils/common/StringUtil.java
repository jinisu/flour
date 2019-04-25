/**
 * 文件名：StringUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年7月28日 上午11:01:55
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.util.Random;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年7月28日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class StringUtil {

	public static boolean isEmpty(String str) {
		return str == null || str.equals("");
	}

	public static String getRandomString(int length) { // length表示生成字符串的长度
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}
}
