/**
 * 文件名：AgeUtils.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2015年10月14日 下午1:09:33
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2015年10月14日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class AgeUtils {

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2015年10月14日
	 * @author: suhs - jinisu@163.com
	 * @update: 2015年10月14日 下午1:12:32  suhs
	 */
	public static int userMonthAge(String birthday) {

		long date1;
		try {
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
			if (StringUtil.isEmpty(birthday)) {
				return 0;
			}
			date1 = sFormat.parse(birthday).getTime();
			long date2 = System.currentTimeMillis(); // 取当前时间的时间戳

			int month = Math.round((date2 - date1) / 1000 / 3600 / 24 / 30); // 四舍五入
			return month;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2015年10月14日
	 * @author: suhs - jinisu@163.com
	 * @update: 2015年10月14日 下午1:12:32  suhs
	 */
	public static int userMonthAge(String birthday, Date date) {

		long date1;
		try {
			birthday = birthday.replaceAll("\\/", "-");
			birthday = birthday.replaceAll("\\.", "-");
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
			if (StringUtil.isEmpty(birthday)) {
				return 0;
			}
			date1 = sFormat.parse(birthday).getTime();
			long date2 = date.getTime();

			int month = Math.round((date2 - date1) / 1000 / 3600 / 24 / 30); // 四舍五入
			return month;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
