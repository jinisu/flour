package com.rrkj.flour.utils.web.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.rrkj.flour.utils.common.StringUtil;
import com.rrkj.flour.utils.web.exception.ExceptionCode;

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {

	// private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

//	@Autowired
//	IThriftClient thriftClient;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// token
		String accessToken = request.getParameter("accessToken");
//		if (!StringUtil.isEmpty(accessToken)) {
//
//			SignService.Iface oauthClient = thriftClient.getIfaceClient(SignService.Client.class,
//					NSnsConfigure.OAUTH2_SERVICE);
//
//			SignToken token = oauthClient.checkAccessToken(accessToken);
//			if (token.getCode() == ExceptionCode.SUCCESS) {
//				request.setAttribute("user", token.getData());
//				return true;
//			}
//		}

//		response.setStatus(HttpStatus.OK.value());
//		response.setContentType("application/json");
//		response.getWriter()
//				.print("{\"code\":" + ExceptionCode.AUTHENTICATION_ERROR + ",\"message\":\"AccessToken ERROR!\"}");
		return true;
	}
}