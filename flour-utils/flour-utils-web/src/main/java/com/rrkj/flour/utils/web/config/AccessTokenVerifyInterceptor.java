package com.rrkj.flour.utils.web.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rrkj.flour.oauth2.api.LoginGrpcServiceGrpc.LoginGrpcServiceBlockingStub;
import com.rrkj.flour.oauth2.api.TLoginResponse;
import com.rrkj.flour.oauth2.api.TString;
import com.rrkj.flour.utils.common.StringUtil;
import com.rrkj.flour.utils.web.exception.ExceptionCode;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {

	private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

	@GrpcClient("oauth2-service")
	private LoginGrpcServiceBlockingStub loginStub;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(true)
			return true;
		// token
		String accessToken = request.getParameter("accessToken");

		if (!StringUtil.isEmpty(accessToken)) {
			TLoginResponse loginResponse = loginStub.checkAccessToken(TString.newBuilder().setStr(accessToken).build());
			if (loginResponse != null) {
				loginResponse.getUserid();
				if (loginResponse.getCode() == ExceptionCode.SUCCESS) {
					Map<String, Object> userData = new HashMap<>();
					userData.put("userid", loginResponse.getUserid());
					userData.put("username", loginResponse.getUsername());
					request.setAttribute("user", userData);
					return true;
				}
			}
		}

		response.setStatus(HttpStatus.OK.value());
		response.setContentType("application/json");
		response.getWriter()
				.print("{\"code\":" + ExceptionCode.AUTHENTICATION_ERROR + ",\"message\":\"AccessToken ERROR!\"}");
		return true;
	}
}