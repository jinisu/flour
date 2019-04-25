/**
 * 文件名：AccountService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午6:41:11
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.rrkj.flour.user.entities.Account;
import com.rrkj.flour.user.repositories.AccountRepository;
import com.rrkj.flour.user.services.IAccountService;
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
public class AccountService extends CrudService<Account, Long> implements IAccountService {

	@Autowired
	private AccountRepository repository;

	@Override
	public CrudRepository<Account, Long> getRepository() {
		return repository;
	}

}
