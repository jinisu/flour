/**
 * 文件名：AuthorizationException.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月3日 上午11:01:32
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web.exception;

/**
 * <p> Title: [授权异常]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月3日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class AuthorizationException extends ErrorCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2709975961475216176L;

	public AuthorizationException(int code) {
		super(code);
	}

	public AuthorizationException(int code, String message) {
		super(code, message);
	}

	public AuthorizationException(int code, String message, Throwable e) {
		super(code, message, e);
	}

	public AuthorizationException(Exception e) {
		super(ExceptionCode.AUTHORIZATION_ERROR, e.getMessage(), e.getCause());
	}

	public AuthorizationException() {
		super(ExceptionCode.AUTHORIZATION_ERROR);
	}

	public AuthorizationException(String message, Throwable cause) {
		super(ExceptionCode.AUTHORIZATION_ERROR, message, cause);
	}

	public AuthorizationException(Throwable cause) {
		super(ExceptionCode.AUTHORIZATION_ERROR, cause.getMessage(), cause);
	}

	public AuthorizationException(String msg) {
		super(ExceptionCode.AUTHORIZATION_ERROR, msg);
	}
}
