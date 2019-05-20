/**
 * 文件名：MenuItemController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:50:04
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.platform.web.entities.MenuItem;
import com.rrkj.flour.platform.web.services.IMenuItemService;
import com.rrkj.flour.utils.web.CrudController;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("menuItem")
public class MenuItemController extends CrudController<MenuItem, Long, IMenuItemService> {

}
