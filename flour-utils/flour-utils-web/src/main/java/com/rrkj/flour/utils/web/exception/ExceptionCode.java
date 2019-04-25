/**
 * 文件名：ExceptionCode.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月3日 下午12:05:07
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web.exception;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月3日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class ExceptionCode {

	/**
	 * 成功
	 */
	public static final int SUCCESS = 0X0;

	/**
	 * 参数不合法
	 */
	public static final int ARGUMENT_ERROR = 0x100;

	/**
	 * 参数不在数据库中
	 */
	public static final int ARGUMENT_OUT0F_DATABASE_ERROR = 0x110;

	/**
	 * 认证失败
	 */
	public static final int AUTHENTICATION_ERROR = 0x200;

	// shaoneng add
	/**
	 * 认证登陆异常
	 */
	public static final int AUTHENTICATION_ABNORMAL_LOGIN_ERROR = 0x201;

	/**
	 * 多次输入密码错误异常
	 */
	public static final int AUTHENTICATION_INCORRECT_PASSWORD_ERROR = 0x220;

	/**
	 * 密码错误1次
	 */
	public static final int AUTHENTICATION_INCORRECT_ONE_ERROR = 0x221;

	/**
	 * 密码错误2次
	 */
	public static final int AUTHENTICATION_INCORRECT_TWO_ERROR = 0x222;

	/**
	 * 密码错误3次
	 */
	public static final int AUTHENTICATION_INCORRECT_THREE_ERROR = 0x223;

	/**
	 * 密码错误4次
	 */
	public static final int AUTHENTICATION_INCORRECT_FOUR_ERROR = 0x224;

	/**
	 * 密码错误5次
	 */
	public static final int AUTHENTICATION_INCORRECT_FIVE_ERROR = 0x225;

	/**
	 * 密码错误大于最大次数
	 */
	public static final int AUTHENTICATION_INCORRECT_EXCESSIVE_ERROR = 0x229;

	/**
	 * 异地登陆异常
	 */
	public static final int AUTHENTICATION_OTHER_PLACE_ERROR = 0x230;

	/**
	 * 换设备登陆异常
	 */
	public static final int AUTHENTICATION_OTHER_DEVICE_ERROR = 0x240;

	/**
	 * 验证码错误
	 */
	public static final int AUTHENTICATION_VERIFICATION_CODE_ERROR = 0x250;

	/**
	 * 授权失败
	 */
	public static final int AUTHORIZATION_ERROR = 0x400;

	/**
	 * 首次登陆不能忘记密码
	 */
	public static final int AUTHORIZATION_FIRST_LOGIN_FORGET_PASSWORD = 0x410;

	/**
	 * 业务异常
	 */
	public static final int BUSINESS_ERROR = 0x800;

	/**
	 * 调用失败
	 */
	public static final int INVOKE_ERROR = 0xF01;

	/**
	 * 请求被拦截
	 */
	public static final int INVOKE_INTECEPTOR_ERROR = 0xF04;

	/**
	 * 系统错误
	 */
	public static final int SYSTEM_ERROR = 0xF0F;

	/**
	 * 系统数据为空
	 */
	public static final int SYSTEM_DATA_EMPTY_ERROR = 0xF1F;

	/**
	 * 未知错误
	 */
	public static final int UNKONEN_ERROR = 0xFFF;
}
