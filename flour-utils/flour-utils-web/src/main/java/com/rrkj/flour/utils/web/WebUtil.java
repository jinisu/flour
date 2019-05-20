/**
 * 文件名：WebUtil.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午8:36:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月20日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public class WebUtil {

	public static long getUseridByRequest(HttpServletRequest request) {
		long userid = 0;
		Map<String, String> user = (Map<String, String>) request.getAttribute("user");
		if (user != null) {
			userid = Long.valueOf(user.get("uid").toString());
		}
		return userid;
	}
}
