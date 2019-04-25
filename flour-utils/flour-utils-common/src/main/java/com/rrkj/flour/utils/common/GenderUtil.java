/**
 * 文件名：SexUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年9月2日 下午12:27:24
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年9月2日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class GenderUtil {

	public static String sex2String(int sex) {
		if (sex == 1) {
			return "男";
		} else if (sex == 2) {
			return "女";
		} else {
			return "未知";
		}
	}

	public static int sex2Int(String sex) {
		if ("男".equals(sex)) {
			return 1;
		} else if ("女".equals(sex)) {
			return 2;
		} else {
			return 0;
		}
	}
}
