/**
 * 文件名：MenuItemService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:51:31
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.services.impl;

import org.springframework.stereotype.Service;

import com.rrkj.flour.platform.web.entities.MenuItem;
import com.rrkj.flour.platform.web.repositories.MenuItemRepository;
import com.rrkj.flour.platform.web.services.IMenuItemService;
import com.rrkj.flour.utils.service.CrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class MenuItemService extends CrudService<MenuItem, Long, MenuItemRepository> implements IMenuItemService {

}