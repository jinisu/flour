/**
 * 文件名：SingleFileUploadResponse.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月29日 上午7:11:06
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services.bo;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月29日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public class SingleFileUploadResponse {

	private boolean uploaded;

	private String url;

	public void setUploaded(boolean uploaded) {
		this.uploaded = uploaded;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public boolean isUploaded() {
		return uploaded;
	}
}
