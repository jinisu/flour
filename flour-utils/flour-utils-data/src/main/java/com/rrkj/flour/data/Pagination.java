/**
 * 文件名：Pagination.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2018年2月4日 上午9:23:03
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.data;

import java.util.List;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2018年2月4日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class Pagination<T> {

	private List<T> content;

	private int totalElements = 0;

	private int pageSize = 0;

	private int page = 0;

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}
