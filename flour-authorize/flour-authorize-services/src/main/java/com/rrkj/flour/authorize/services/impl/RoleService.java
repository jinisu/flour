/**
 * 文件名：RoleService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午9:32:36
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.services.impl;

import org.springframework.stereotype.Service;

import com.rrkj.flour.authorize.entities.Role;
import com.rrkj.flour.authorize.repositories.RoleRepository;
import com.rrkj.flour.authorize.services.IRoleService;
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
public class RoleService extends CrudService<Role, Long, RoleRepository> implements IRoleService {

}
