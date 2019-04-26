/**
 * 文件名：IUserService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午3:37:22
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.services;

import java.util.List;

import com.rrkj.flour.user.entities.User;
import com.rrkj.flour.utils.service.ICrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface IUserService extends ICrudService<User, Long> {

	public List<User> queryByUser(User user);

	public List<User> queryByNameAndLabel(String name, String label);

	public List<User> queryByPhone(String name);

	public User queryByUuid(String uuid);
}
