/**
 * 文件名：InvokeInteceptorException.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2016年8月1日 上午11:58:31
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web.exception;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月1日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class InvokeException extends ErrorCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4473077497925369103L;

	public InvokeException(int code) {
		super(code);
	}

	public InvokeException(int code, String message) {
		super(code, message);
	}

	public InvokeException(int code, String message, Throwable e) {
		super(code, message, e);
	}

	public InvokeException() {
		super(ExceptionCode.INVOKE_ERROR);
	}

	public InvokeException(String message, Throwable cause) {
		super(ExceptionCode.INVOKE_ERROR, message, cause);
	}

	public InvokeException(Throwable cause) {
		super(ExceptionCode.INVOKE_ERROR, cause.getMessage(), cause);
	}

	public InvokeException(String msg) {
		super(ExceptionCode.INVOKE_ERROR, msg);
	}

}
