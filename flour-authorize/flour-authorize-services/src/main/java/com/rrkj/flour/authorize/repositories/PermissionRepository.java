/**
 * 文件名：PermissionRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午6:34:47
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.authorize.entities.Permission;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {

	@Query(value = "select r.* from rrkj_flour_authorize_permission r, rrkj_flour_authorize_role_permission u where r.id = u.permission_id and u.role_id = ?1 and (u.app_key = '' or u.app_key = ?2 ) and r.`status` = 1 and u.`status` = 1 ", nativeQuery = true)
	public List<Permission> queryByRoleidAndAppKey(long id, String str);

	@Query(value = "select r.* from rrkj_flour_authorize_permission r, rrkj_flour_authorize_role_permission u where r.id = u.permission_id and u.role_id = ?1 and r.`status` = 1 and u.`status` = 1 ", nativeQuery = true)
	public List<Permission> queryByRoleid(long id);

}
