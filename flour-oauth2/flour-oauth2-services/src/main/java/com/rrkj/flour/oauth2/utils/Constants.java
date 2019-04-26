package com.rrkj.flour.oauth2.utils;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2016年8月2日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 诺博教育</p>
 * @author suhs - bob.su@noboedu.com
 * @version 1.0
 */
public class Constants {

	public static final String INVALID_CLIENT_DESCRIPTION = "客户端验证失败，如错误的client_id/client_secret。";

	public static final String INVALID_USER_DESCRIPTION = "用户验证失败，如错误的username/password。";

	public static final String RESOURCE_SERVER_NAME = "oauth-server";

	public static final String INVALID_CLIENT_ID = "客户端验证失败，如错误的client_id/client_secret。";

	public static final String INVALID_ACCESS_TOKEN = "accessToken无效或已过期。";

	public static final String INVALID_REDIRECT_URI = "缺少授权成功后的回调地址。";

	public static final String INVALID_AUTH_CODE = "错误的授权码。";

	public static final String NOBOEDU_ACCOUNT_TYPE = "noboedu";

	public static final String WEIXIN_ACCOUNT_TYPE = "weixin";
}
