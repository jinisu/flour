/**
 * 文件名：IPermissionService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午6:36:28
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.services;

import java.util.List;

import com.rrkj.flour.authorize.entities.Permission;
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
public interface IPermissionService extends ICrudService<Permission, Long> {

	public List<Permission> queryByRoleidAndAppKey(long id, String str);

	public List<Permission> queryByRoleid(long id);

}
