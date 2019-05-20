/**
 * 文件名：RoleRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午6:35:03
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.authorize.entities.Role;

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
public interface RoleRepository extends CrudRepository<Role, Long> {

	@Query(value = "select r.* from rrkj_flour_authorize_role r, rrkj_flour_authorize_user_role u where r.id = u.role_id and u.userid = ?1 and r.`status` = 1 and u.`status` = 1 ", nativeQuery = true)
	public List<Role> queryByUserid(long id);

}
