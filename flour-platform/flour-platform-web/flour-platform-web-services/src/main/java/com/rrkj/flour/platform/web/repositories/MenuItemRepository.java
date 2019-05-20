/**
 * 文件名：MenuItemRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:45:33
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.platform.web.entities.MenuItem;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Repository
public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {

	public MenuItem getMenuItemByCode(String code);

}
