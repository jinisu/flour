package com.rrkj.flour.oauth2.services.impl;

import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.utils.common.MD5Util;
import com.rrkj.flour.utils.common.StringUtil;

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
@Service
public class PasswordHelper {

	private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

	@Value("${password.algorithmName}")
	private String algorithmName = "md5";

	@Value("${password.hashIterations}")
	private int hashIterations = 2;

	public void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator) {
		this.randomNumberGenerator = randomNumberGenerator;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public void setHashIterations(int hashIterations) {
		this.hashIterations = hashIterations;
	}

	public void encryptPassword(Oauth2User user) {

		user.setSalt(randomNumberGenerator.nextBytes().toHex());

		String newPassword = new SimpleHash(algorithmName, user.getPassword(),
				ByteSource.Util.bytes(user.getUsername() + user.getSalt()), hashIterations).toHex();

		user.setPassword(newPassword);
	}

	/**
	 * 根据用户名和盐值加密
	 * @param username
	 * @param password
	 * @param salt
	 */
	public String encryptPassword(String username, String password, String salt) {
		if (StringUtil.isEmpty(salt)) {
			// 为空，使用MD5进行加密
			return MD5Util.getMD5String(password);
		}
		String pwd = new SimpleHash(algorithmName, password, ByteSource.Util.bytes(username + salt), hashIterations)
				.toHex();

		return pwd;
	}

	public static void main(String[] args) {
		System.out.println(new PasswordHelper().encryptPassword("admin", "admin", "15801582284"));
	}

}
