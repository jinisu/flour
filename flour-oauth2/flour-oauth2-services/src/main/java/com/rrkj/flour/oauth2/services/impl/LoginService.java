/**
 * 文件名：LoginService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午2:46:18
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services.impl;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.oauth2.services.ILoginService;
import com.rrkj.flour.oauth2.services.IOAuthService;
import com.rrkj.flour.oauth2.services.IOauth2UserService;
import com.rrkj.flour.oauth2.services.bo.LoginResponse;
import com.rrkj.flour.utils.common.StringUtil;
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
@Service
public class LoginService implements ILoginService {

	@Autowired
	private IOauth2UserService userService;

	@Autowired
	private IOAuthService oAuthService;

	// private final static Pattern pattern = Pattern.compile("^1[3|4|5|7|8][0-9]{9}$");

	private final static Logger logger = LoggerFactory.getLogger(LoginService.class);

	@Override
	public LoginResponse loginByUsernameAndPassword(String username, String password) {
		// 判断参数是否为空
		if (StringUtil.isEmpty(username) || StringUtil.isEmpty(password)) {
			return null;
		}
		LoginResponse res = new LoginResponse();
		try {
			// 写登录逻辑
			Oauth2User user = userService.findByUsername(username);
			if (user != null) {
				if (!userService.checkOauthUser(username, password, user.getSalt(), user.getPassword())) {
					res.setCode(ExceptionCode.AUTHENTICATION_ERROR);
					res.setMessage("登陆失败：密码不正确");
					logger.error(user.getUsername() + "用户登陆失败！");
					return res;
				} else {
					// 生成Access Token
					OAuthIssuer oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
					final String accessToken = oauthIssuerImpl.accessToken();
					oAuthService.addAccessToken(accessToken, username);
					res.setCode(ExceptionCode.SUCCESS);
					res.setAccessToken(accessToken);
					res.setUserid(user.getUserid());
					res.setUsername(user.getUsername());
					// 添加token
					return res;
				}
			} else {
				res.setCode(ExceptionCode.AUTHENTICATION_ERROR);
				res.setMessage("登录失败:用户名不正确!");
				return res;
			}
		} catch (Exception e) {
			e.printStackTrace();
			res.setCode(ExceptionCode.AUTHENTICATION_ERROR);
			res.setMessage("系统错误!");
			return res;
		}
	}

	@Override
	public LoginResponse loginByPhoneAndPassword(String phone, String password) {
		return null;
	}

	@Override
	public int sendSmsCode(String phone) {
		return 0;
	}

	@Override
	public LoginResponse loginByPhoneAndCode(String phone, String code) {
		return null;
	}

	@Override
	public int checkAcessToken(String accessToken, String clientid, String clientSecret) {
		return 0;
	}

	@Override
	public int logout(String accessToken) {
		return 0;
	}

}
