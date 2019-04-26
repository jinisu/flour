/**
 * 文件名：IOauth2UserService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午9:44:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.utils.service.ICrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface IOauth2UserService extends ICrudService<Oauth2User, Long> {

	public Oauth2User findByUsername(String username);

	public boolean checkOauthUser(String username, String password, String salt, String password2);

}