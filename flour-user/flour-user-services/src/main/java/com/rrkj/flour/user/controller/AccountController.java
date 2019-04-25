/**
 * 文件名：AccountController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午6:42:57
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.user.entities.Account;
import com.rrkj.flour.user.services.IAccountService;
import com.rrkj.flour.utils.service.ICrudService;
import com.rrkj.flour.utils.web.CrudController;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("account")
public class AccountController extends CrudController<Account, Long> {

	@Autowired
	private IAccountService service;

	@Override
	public ICrudService<Account, Long> getService() {
		return service;
	}

}