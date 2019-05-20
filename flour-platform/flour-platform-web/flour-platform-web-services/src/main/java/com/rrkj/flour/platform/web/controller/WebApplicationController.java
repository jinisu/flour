/**
 * 文件名：WebApplicationController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午8:32:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.platform.web.entities.WebApplication;
import com.rrkj.flour.platform.web.services.IWebApplicationService;
import com.rrkj.flour.utils.web.CrudController;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月20日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("webapp")
public class WebApplicationController extends CrudController<WebApplication, Long, IWebApplicationService> {

}
