/**
 * 文件名：ILoginService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午2:23:17
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services;

import com.rrkj.flour.oauth2.services.bo.LoginResponse;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface ILoginService {

	public LoginResponse loginByUsernameAndPassword(String username, String password);

	public LoginResponse loginByPhoneAndPassword(String phone, String password);

	public int sendSmsCode(String phone);

	public LoginResponse loginByPhoneAndCode(String phone, String code);

	public int checkAcessToken(String accessToken, String clientid, String clientSecret);

	public int logout(String accessToken);
}
