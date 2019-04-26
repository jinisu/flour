/**
 * 文件名：Oauth2Controller.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午11:28:50
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuer;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.oauth2.services.IOAuthService;
import com.rrkj.flour.oauth2.services.IOauth2ApplicationService;
import com.rrkj.flour.oauth2.services.IOauth2UserService;
import com.rrkj.flour.oauth2.utils.Constants;
import com.rrkj.flour.utils.web.JsonUtil;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/")
public class Oauth2Controller {

	@Autowired
	private IOAuthService oAuthService;

	@Autowired
	private IOauth2ApplicationService clientService;

	@Autowired
	private IOauth2UserService userService;

	@ResponseBody
	@RequestMapping("/accessToken")
	public HttpEntity accessToken(HttpServletRequest request, HttpServletResponse resp)
			throws URISyntaxException, OAuthSystemException {

		try {
			// 构建OAuth请求
			OAuthTokenRequest oauthRequest = new OAuthTokenRequest(request);

			// 检查提交的客户端id是否正确
			if (!oAuthService.checkClientId(oauthRequest.getClientId())) {
				OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
						.setError(OAuthError.TokenResponse.INVALID_CLIENT)
						.setErrorDescription(Constants.INVALID_CLIENT_ID).buildJSONMessage();
				return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
			}

			// 检查客户端安全KEY是否正确
			if (!oAuthService.checkClientSecret(oauthRequest.getClientSecret())) {
				OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_UNAUTHORIZED)
						.setError(OAuthError.TokenResponse.UNAUTHORIZED_CLIENT)
						.setErrorDescription(Constants.INVALID_CLIENT_ID).buildJSONMessage();
				return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
			}

			String authCode = oauthRequest.getParam(OAuth.OAUTH_CODE);
			// 检查验证类型，此处只检查AUTHORIZATION_CODE类型，其他的还有PASSWORD或REFRESH_TOKEN
			if (oauthRequest.getParam(OAuth.OAUTH_GRANT_TYPE).equals(GrantType.AUTHORIZATION_CODE.toString())) {
				if (!oAuthService.checkAuthCode(authCode)) {
					OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
							.setError(OAuthError.TokenResponse.INVALID_GRANT)
							.setErrorDescription(Constants.INVALID_AUTH_CODE).buildJSONMessage();
					return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
				}
			}

			// 生成Access Token
			OAuthIssuer oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
			final String accessToken = oauthIssuerImpl.accessToken();
			oAuthService.addAccessToken(accessToken, oAuthService.getUsernameByAuthCode(authCode));

			// 生成OAuth响应
			OAuthResponse response = OAuthASResponse.tokenResponse(HttpServletResponse.SC_OK)
					.setAccessToken(accessToken).setExpiresIn(String.valueOf(oAuthService.getExpireIn()))
					.buildJSONMessage();

			// 根据OAuthResponse生成ResponseEntity
			return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));

		} catch (OAuthProblemException e) {
			// 构建错误响应
			OAuthResponse res = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST).error(e)
					.buildJSONMessage();
			return new ResponseEntity(res.getBody(), HttpStatus.valueOf(res.getResponseStatus()));
		}
	}

	@RequestMapping(value = "/authorize")
	public Object authorize(Model model, HttpServletRequest request) throws URISyntaxException, OAuthSystemException {

		try {

			// 构建OAuth 授权请求
			OAuthAuthzRequest oauthRequest = new OAuthAuthzRequest(request);

			// 检查传入的客户端id是否正确
			if (!oAuthService.checkClientId(oauthRequest.getClientId())) {
				OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
						.setError(OAuthError.TokenResponse.INVALID_CLIENT)
						.setErrorDescription(Constants.INVALID_CLIENT_ID).buildJSONMessage();
				return new ResponseEntity(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
			}

			// 如果用户没有登录，跳转到登陆页面
			if (!login(request)) {// 登录失败时跳转到登陆页面
				// TODO 需要区分，登录的用户名密码错误与请求的参数错误。
				model.addAttribute("client", clientService.findByAppKey(oauthRequest.getClientId()));
				model.addAttribute("response_type", ResponseType.CODE.toString());
				return "oauth2login";
			}

			String username = request.getParameter("username"); // 获取用户名
			// 生成授权码
			String authorizationCode = null;
			// responseType目前仅支持CODE，另外还有TOKEN
			String responseType = oauthRequest.getParam(OAuth.OAUTH_RESPONSE_TYPE);
			if (responseType.equals(ResponseType.CODE.toString())) {
				OAuthIssuerImpl oauthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
				authorizationCode = oauthIssuerImpl.authorizationCode();
				oAuthService.addAuthCode(authorizationCode, username);
			} else {
				// TODO ResponseType.TOKEN.toString()

			}

			// 进行OAuth响应构建
			OAuthASResponse.OAuthAuthorizationResponseBuilder builder = OAuthASResponse.authorizationResponse(request,
					HttpServletResponse.SC_FOUND);
			// 设置授权码
			builder.setCode(authorizationCode);
			// 得到到客户端重定向地址
			String redirectURI = oauthRequest.getParam(OAuth.OAUTH_REDIRECT_URI);

			// 构建响应
			final OAuthResponse response = builder.location(redirectURI).buildQueryMessage();

			// 根据OAuthResponse返回ResponseEntity响应
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(new URI(response.getLocationUri()));
			return new ResponseEntity(headers, HttpStatus.valueOf(response.getResponseStatus()));
		} catch (OAuthProblemException e) {

			// 出错处理
			String redirectUri = e.getRedirectUri();
			if (OAuthUtils.isEmpty(redirectUri)) {
				// 告诉客户端没有传入redirectUri直接报错
				HttpHeaders responseHeaders = new HttpHeaders();
				responseHeaders.add("Content-Type", "application/json; charset=utf-8");
				com.rrkj.flour.utils.web.ResponseEntity<Integer> status = new com.rrkj.flour.utils.web.ResponseEntity<>();
				status.setCode(HttpStatus.NOT_FOUND.value());
				status.setMessage(Constants.INVALID_REDIRECT_URI);
				return new ResponseEntity(JsonUtil.toJSON(status), responseHeaders, HttpStatus.NOT_FOUND);
			}
			// 返回错误消息（如?error=）
			final OAuthResponse response = OAuthASResponse.errorResponse(HttpServletResponse.SC_FOUND).error(e)
					.location(redirectUri).buildQueryMessage();
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(new URI(response.getLocationUri()));
			return new ResponseEntity(headers, HttpStatus.valueOf(response.getResponseStatus()));
		}
	}

	private boolean login(HttpServletRequest request) {
		if ("get".equalsIgnoreCase(request.getMethod())) {
			request.setAttribute("error", "非法的请求");
			return false;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			request.setAttribute("error", "登录失败:用户名或密码不能为空");
			return false;
		}
		try {
			// 写登录逻辑
			Oauth2User user = userService.findByUsername(username);
			if (user != null) {
				if (!userService.checkOauthUser(username, password, user.getSalt(), user.getPassword())) {
					request.setAttribute("error", "登录失败:密码不正确");
					return false;
				} else {
					return true;
				}
			} else {
				request.setAttribute("error", "登录失败:用户名不正确");
				return false;
			}
		} catch (Exception e) {
			request.setAttribute("error", "登录失败:" + e.getClass().getName());
			return false;
		}
	}
}
