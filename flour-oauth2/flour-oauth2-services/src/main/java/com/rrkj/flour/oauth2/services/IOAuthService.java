/**
 * 
 */
package com.rrkj.flour.oauth2.services;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface IOAuthService {

	// 添加 auth code
	public void addAuthCode(String authCode, String username);

	// 添加 access token
	public void addAccessToken(String accessToken, String username);

	// 验证auth code是否有效
	public boolean checkAuthCode(String authCode);

	// 验证access token是否有效
	public boolean checkAccessToken(String accessToken);

	public String getUsernameByAuthCode(String authCode);

	public String getUsernameByAccessToken(String accessToken);

	public void addUserByAccessCode(String username, String accessToken);

	public String getAccessCodeByUsername(String username);

	public void evictOldAccessToken(String accessToken);

	public long getExpireIn();

	public boolean checkClientId(String clientId);

	public boolean checkClientSecret(String clientSecret);

}
