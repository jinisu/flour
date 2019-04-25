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
public class SystemException extends ErrorCodeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5018394428167853107L;

	/**
	 * 
	 */
	public SystemException(int code) {
		super(code);
	}

	public SystemException(int code, String message) {
		super(code, message);
	}

	public SystemException(int code, String message, Throwable e) {
		super(code, message, e);
	}

	public SystemException() {
		super(ExceptionCode.SYSTEM_ERROR);
	}

	public SystemException(String message, Throwable cause) {
		super(ExceptionCode.SYSTEM_ERROR, message, cause);
	}

	public SystemException(Throwable cause) {
		super(ExceptionCode.SYSTEM_ERROR, cause.getMessage(), cause);
	}

	public SystemException(String msg) {
		super(ExceptionCode.SYSTEM_ERROR, msg);
	}

}
