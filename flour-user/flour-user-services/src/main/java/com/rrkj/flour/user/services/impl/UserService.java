/**
 * 文件名：UserService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午3:39:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rrkj.flour.user.entities.User;
import com.rrkj.flour.user.repositories.UserRepository;
import com.rrkj.flour.user.services.IUserService;
import com.rrkj.flour.utils.service.CrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class UserService extends CrudService<User, Long, UserRepository> implements IUserService {

	@Override
	public List<User> queryByUser(User user) {
		return null;
	}

	@Override
	public List<User> queryByNameAndLabel(String name, String label) {
		return null;
	}

	@Override
	public List<User> queryByPhone(String name) {
		return null;
	}

	@Override
	public User queryByUuid(String uuid) {
		return null;
	}

}
