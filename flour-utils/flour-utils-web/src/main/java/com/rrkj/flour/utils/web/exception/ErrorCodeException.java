/**
 * 文件名：ErrorCodeException.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月4日 下午2:36:06
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web.exception;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月4日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class ErrorCodeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8104127305766200867L;

	private int code;

	public ErrorCodeException() {
		super("");
		this.code = ExceptionCode.UNKONEN_ERROR;
	}

	public ErrorCodeException(int code) {
		super("");
		this.code = code;
	}

	public ErrorCodeException(int code, String message) {
		super(message);
		this.code = code;
	}

	public ErrorCodeException(int code, String message, Throwable e) {
		super(e);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
