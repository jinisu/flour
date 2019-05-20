/**
 * 文件名：MenuController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:53:58
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.platform.web.entities.WebApplication;
import com.rrkj.flour.platform.web.services.IMenuService;
import com.rrkj.flour.utils.web.ResponseEntity;
import com.rrkj.flour.utils.web.WebUtil;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("menu")
public class MenuController {

	@Autowired
	private IMenuService service;

	@RequestMapping(value = "/queryAllMenu", method = RequestMethod.GET)
	public ResponseEntity<WebApplication> queryAllMenu(@RequestParam(name = "roleid", required = false) Long roleid,
			@RequestParam(name = "appKey", required = false) String appKey,
			@RequestParam(name = "domain", required = false) String domain,
			@RequestParam(name = "accessToken", required = false) String accessToken, HttpServletRequest request) {

		long userid = WebUtil.getUseridByRequest(request);

		WebApplication app = service.queryAllMenu(userid, roleid, appKey, domain);

		ResponseEntity<WebApplication> res = new ResponseEntity<>();
		res.setData(app);

		return res;
	}
}
