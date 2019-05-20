/**
 * 文件名：RoleController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午6:39:54
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.authorize.entities.Role;
import com.rrkj.flour.authorize.services.IRoleService;
import com.rrkj.flour.utils.web.CrudController;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController
@RequestMapping("role")
public class RoleController extends CrudController<Role, Long, IRoleService> {

}
