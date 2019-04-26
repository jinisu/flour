/**
 * 文件名：Oauth2UserService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午10:15:20
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.oauth2.repositories.Oauth2UserRepository;
import com.rrkj.flour.oauth2.services.IOauth2UserService;
import com.rrkj.flour.utils.service.CrudService;

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
public class Oauth2UserService extends CrudService<Oauth2User, Long, Oauth2UserRepository>
		implements IOauth2UserService {

	@Autowired
	private PasswordHelper passwordHelper;

	@Autowired
	private Oauth2UserRepository repository;

	@Override
	public Oauth2User findByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public boolean checkOauthUser(String username, String password, String salt, String encryptpwd) {
		String pwd = passwordHelper.encryptPassword(username, password, salt);
		return pwd.equals(encryptpwd);
	}

}