/**
 * 文件名：FCModelThemeController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午9:49:43
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.cms.entities.FCModelTheme;
import com.rrkj.flour.cms.services.IFCModelThemeService;
import com.rrkj.flour.utils.web.CrudController;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("modelTheme")
public class FCModelThemeController extends CrudController<FCModelTheme, Long, IFCModelThemeService> {

}
