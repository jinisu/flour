package com.rrkj.flour.utils.common;

import java.util.UUID;

/**
 * <p> Title: [ID生成工具]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2015年9月22日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class IDGenerator {

	public static String generateId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static String generateId(String sequenceName) {
		return generateId();
	}
}
