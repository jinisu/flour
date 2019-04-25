/**
 * 文件名：ResponseEntity.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2018年9月6日 下午5:03:18
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2018年9月6日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class ResponseEntity<T> {

	private int code = 0;

	private String message = "";

	private T data = null;

	public ResponseEntity() {
	}

	public ResponseEntity(T data) {
		this.data = data;
	}

	public ResponseEntity(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResponseEntity(int code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public T getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
