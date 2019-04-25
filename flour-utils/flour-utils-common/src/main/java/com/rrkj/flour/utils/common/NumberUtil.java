/**
 * 文件名：NumberUtils.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2017年12月29日 上午8:26:05
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.common;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2017年12月29日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class NumberUtil {

	private static final String[] UNITS = { "", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", };

	private static final String[] NUMS = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九", };

	/** 
	 *  数字转换成中文汉字 
	 *  @param value 要转换的数字 
	 *  @return 返回数字转后的汉字字符串 
	 */
	public static String number2Chinese(int value) {

		String result = ""; // 转译结果

		for (int i = String.valueOf(value).length() - 1; i >= 0; i--) {// String.valueOf(value) 转换成String型得到其长度
																		// 并排除个位,因为个位不需要单位
			int r = (int) (value / Math.pow(10, i));// value / Math.pow(10, i) 截位匹配单位
			result += NUMS[r % 10] + UNITS[i];
		}

		result = result.replaceAll("零[十, 百, 千]", "零");// 匹配字符串中的 "零[十, 百, 千]" 替换为 "零"
		result = result.replaceAll("零+", "零");// 匹配字符串中的1或多个 "零" 替换为 "零"
		result = result.replaceAll("零([万, 亿])", "$1");
		result = result.replaceAll("亿万", "亿"); // 亿万位拼接时发生的特殊情况

		if (result.startsWith("一十")) { // 判断是否以 "一十" 开头 如果是截取第一个字符
			result = result.substring(1);
		}

		if (result.endsWith("零")) { // 判断是否以 "零" 结尾 如果是截取除 "零" 外的字符
			result = result.substring(0, result.length() - 1);
		}

		return result;
	}

	private static final Character[] CN_NUMERIC = { '一', '二', '三', '四', '五', '六', '七', '八', '九', '壹', '贰', '叁', '肆',
			'伍', '陆', '柒', '捌', '玖', '十', '百', '千', '拾', '佰', '仟', '万', '亿', '○', 'Ｏ', '零' };

	private static Map<Character, Integer> cnNumeric = null;

	static {
		cnNumeric = new HashMap<Character, Integer>(40, 0.85f);
		for (int j = 0; j < 9; j++)
			cnNumeric.put(CN_NUMERIC[j], j + 1);
		for (int j = 9; j < 18; j++)
			cnNumeric.put(CN_NUMERIC[j], j - 8);
		cnNumeric.put('两', 2);
		cnNumeric.put('十', 10);
		cnNumeric.put('拾', 10);
		cnNumeric.put('百', 100);
		cnNumeric.put('佰', 100);
		cnNumeric.put('千', 1000);
		cnNumeric.put('仟', 1000);
		cnNumeric.put('万', 10000);
		cnNumeric.put('亿', 100000000);
	}

	public static int isCNNumeric(char c) {
		Integer i = cnNumeric.get(c);
		if (i == null)
			return -1;
		return i.intValue();
	}

	public static int cnNumericToArabic(String cnn, boolean flag) {

		cnn = cnn.trim();
		if (cnn.length() == 1)
			return isCNNumeric(cnn.charAt(0));

		if (flag)
			cnn = cnn.replace('佰', '百').replace('仟', '千').replace('拾', '十').replace('零', ' ');
		// System.out.println(cnn);
		int yi = -1, wan = -1, qian = -1, bai = -1, shi = -1;
		int val = 0;
		yi = cnn.lastIndexOf('亿');
		if (yi > -1) {
			val += cnNumericToArabic(cnn.substring(0, yi), false) * 100000000;
			if (yi < cnn.length() - 1)
				cnn = cnn.substring(yi + 1, cnn.length());
			else
				cnn = "";

			if (cnn.length() == 1) {
				int arbic = isCNNumeric(cnn.charAt(0));
				if (arbic <= 10)
					val += arbic * 10000000;
				cnn = "";
			}
		}

		wan = cnn.lastIndexOf('万');
		if (wan > -1) {
			val += cnNumericToArabic(cnn.substring(0, wan), false) * 10000;
			if (wan < cnn.length() - 1)
				cnn = cnn.substring(wan + 1, cnn.length());
			else
				cnn = "";
			if (cnn.length() == 1) {
				int arbic = isCNNumeric(cnn.charAt(0));
				if (arbic <= 10)
					val += arbic * 1000;
				cnn = "";
			}
		}

		qian = cnn.lastIndexOf('千');
		if (qian > -1) {
			val += cnNumericToArabic(cnn.substring(0, qian), false) * 1000;
			if (qian < cnn.length() - 1)
				cnn = cnn.substring(qian + 1, cnn.length());
			else
				cnn = "";
			if (cnn.length() == 1) {
				int arbic = isCNNumeric(cnn.charAt(0));
				if (arbic <= 10)
					val += arbic * 100;
				cnn = "";
			}
		}

		bai = cnn.lastIndexOf('百');
		if (bai > -1) {
			val += cnNumericToArabic(cnn.substring(0, bai), false) * 100;
			if (bai < cnn.length() - 1)
				cnn = cnn.substring(bai + 1, cnn.length());
			else
				cnn = "";
			if (cnn.length() == 1) {
				int arbic = isCNNumeric(cnn.charAt(0));
				if (arbic <= 10)
					val += arbic * 10;
				cnn = "";
			}
		}

		shi = cnn.lastIndexOf('十');
		if (shi > -1) {
			if (shi == 0)
				val += 1 * 10;
			else
				val += cnNumericToArabic(cnn.substring(0, shi), false) * 10;
			if (shi < cnn.length() - 1)
				cnn = cnn.substring(shi + 1, cnn.length());
			else
				cnn = "";
		}

		cnn = cnn.trim();
		for (int j = 0; j < cnn.length(); j++)
			val += isCNNumeric(cnn.charAt(j)) * Math.pow(10, cnn.length() - j - 1);

		return val;
	}

	public static int qCNNumericToArabic(String cnn) {
		int val = 0;
		cnn = cnn.trim();
		for (int j = 0; j < cnn.length(); j++)
			val += isCNNumeric(cnn.charAt(j)) * Math.pow(10, cnn.length() - j - 1);
		return val;
	}

	/**
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2017年12月29日
	 * @author: suhs - jinisu@163.com
	 * @update: 2017年12月29日 上午8:26:05  suhs
	 */
	public static void main(String[] args) {
		System.out.println(NumberUtil.number2Chinese(22));
		int val = 0;
		val = cnNumericToArabic("三十二万两千四百", true);
		System.out.println(val);
		val = cnNumericToArabic("二百五十", true);
		System.out.println(val);
	}

}
