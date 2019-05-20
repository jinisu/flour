/**
 * 文件名：PermissionService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午9:30:44
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrkj.flour.authorize.entities.Permission;
import com.rrkj.flour.authorize.repositories.PermissionRepository;
import com.rrkj.flour.authorize.services.IPermissionService;
import com.rrkj.flour.utils.service.CrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月20日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class PermissionService extends CrudService<Permission, Long, PermissionRepository>
		implements IPermissionService {

	@Autowired
	private PermissionRepository repository;

	@Override
	public List<Permission> queryByRoleidAndAppKey(long id, String str) {
		return repository.queryByRoleidAndAppKey(id, str);
	}

	@Override
	public List<Permission> queryByRoleid(long id) {
		return repository.queryByRoleid(id);
	}

}
