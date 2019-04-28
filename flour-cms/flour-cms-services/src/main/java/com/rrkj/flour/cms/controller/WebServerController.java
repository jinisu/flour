/**
 * 文件名：WebServerController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午10:13:04
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.cms.services.IWebServerService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("web")
@RestController
public class WebServerController {

	@Autowired
	private IWebServerService service;

	@RequestMapping("/{basedir}/{code}/**")
	public ResponseEntity<byte[]> doRequest(@PathVariable String basedir, @PathVariable String code,
			HttpServletRequest request) {
		// 获取URL，
		// 从URL中得到code, path
		/// services/ncms-service/1.0/web/0/adsfa333/templet/index.html
		String requesturi = request.getRequestURI();
		String pre = basedir + "/" + code + "/";
		String path = requesturi.substring(requesturi.indexOf(pre) + pre.length());

		ResponseEntity<byte[]> response = service.doRequest(code, path, requesturi);
		return response;
	}
}
