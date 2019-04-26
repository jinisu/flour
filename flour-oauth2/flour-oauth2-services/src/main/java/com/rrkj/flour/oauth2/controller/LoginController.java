/**
 * 文件名：LoginController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午11:29:56
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.oauth2.services.ILoginService;
import com.rrkj.flour.oauth2.services.bo.LoginResponse;
import com.rrkj.flour.utils.web.ResponseEntity;
import com.rrkj.flour.utils.web.exception.ExceptionCode;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<LoginResponse> login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {

		ResponseEntity<LoginResponse> res = new ResponseEntity<>();

		LoginResponse loginRes = loginService.loginByUsernameAndPassword(username, password);
		if (loginRes == null) {
			res.setCode(ExceptionCode.AUTHENTICATION_ERROR);
		} else {
			res.setCode(loginRes.getCode());
			res.setMessage(loginRes.getMessage());
			res.setData(loginRes);
		}
		return res;
	}

	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public ResponseEntity<Integer> checkAccessToken(@RequestParam(name = "accessToken") String accesstoken,
			@RequestParam(name = "client_id", required = false) String clientId,
			@RequestParam(name = "client_secret", required = false) String clientSecret) {
		ResponseEntity<Integer> res = new ResponseEntity<>();

		int loginRes = loginService.checkAcessToken(accesstoken, clientId, clientSecret);

		res.setCode(ExceptionCode.SUCCESS);
		res.setData(loginRes);
		return res;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public int signOut(String accessToken) {
		return loginService.logout(accessToken);
	}

}
