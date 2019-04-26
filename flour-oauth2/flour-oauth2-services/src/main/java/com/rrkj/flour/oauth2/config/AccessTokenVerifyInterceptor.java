package com.rrkj.flour.oauth2.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {

	// private final static Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

	// @Autowired
	// IThriftClient thriftClient;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// token
		String accessToken = request.getParameter("accessToken");
		// if (!StringUtil.isEmpty(accessToken)) {
		//
		// SignService.Iface oauthClient = thriftClient.getIfaceClient(SignService.Client.class,
		// NSnsConfigure.OAUTH2_SERVICE);
		//
		// SignToken token = oauthClient.checkAccessToken(accessToken);
		// if (token.getCode() == ExceptionCode.SUCCESS) {
		// request.setAttribute("user", token.getData());
		// return true;
		// }
		// }

		// response.setStatus(HttpStatus.OK.value());
		// response.setContentType("application/json");
		// response.getWriter()
		// .print("{\"code\":" + ExceptionCode.AUTHENTICATION_ERROR + ",\"message\":\"AccessToken ERROR!\"}");
		return true;
	}
}