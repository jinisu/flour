/**
 * 文件名：ArgumentException.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月3日 上午11:08:31
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
public class ArgumentException extends ErrorCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1939729682237860092L;

	private String argumentName;

	public ArgumentException() {
	}

	public ArgumentException(int code) {
		super(code);
	}

	public ArgumentException(int code, String message) {
		super(code, message);
	}

	public ArgumentException(int code, String message, Throwable e) {
		super(code, message, e);
	}

	public ArgumentException(String argumentName) {
		super(ExceptionCode.ARGUMENT_ERROR, argumentName);
		this.argumentName = argumentName;
	}

	public String getArgumentName() {
		return argumentName;
	}

	public void setArgumentName(String argumentName) {
		this.argumentName = argumentName;
	}
}
