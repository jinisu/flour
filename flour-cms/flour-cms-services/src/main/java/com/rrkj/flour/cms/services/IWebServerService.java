/**
 * 文件名：IWebServerService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午10:14:12
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services;

import org.springframework.http.ResponseEntity;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface IWebServerService {

	public ResponseEntity<byte[]> doRequest(String code, String path, String requesturi);
}
