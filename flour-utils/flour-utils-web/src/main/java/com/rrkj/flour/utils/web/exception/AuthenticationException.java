/**
 * 文件名：AuthenticationException.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月2日 上午9:11:33
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web.exception;

/**
 * <p> Title: [认证异常]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月2日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class AuthenticationException extends ErrorCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4149641447387354561L;

	public AuthenticationException(int code) {
		super(code);
	}

	public AuthenticationException(int code, String message) {
		super(code, message);
	}

	public AuthenticationException(int code, String message, Throwable e) {
		super(code, message, e);
	}

	public AuthenticationException(Exception e) {
		super(ExceptionCode.AUTHENTICATION_ERROR, e.getMessage(), e.getCause());
	}

	public AuthenticationException() {
		super(ExceptionCode.AUTHENTICATION_ERROR);
	}

	public AuthenticationException(String message, Throwable cause) {
		super(ExceptionCode.AUTHENTICATION_ERROR, message, cause);
	}

	public AuthenticationException(Throwable cause) {
		super(ExceptionCode.AUTHENTICATION_ERROR, cause.getMessage(), cause);
	}

	public AuthenticationException(String msg) {
		super(ExceptionCode.AUTHENTICATION_ERROR, msg);
	}
}
