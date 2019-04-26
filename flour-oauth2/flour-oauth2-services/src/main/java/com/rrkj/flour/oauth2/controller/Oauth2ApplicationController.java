/**
 * 文件名：Oauth2ApplicationController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午10:19:51
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.oauth2.entities.Oauth2Application;
import com.rrkj.flour.oauth2.services.IOauth2ApplicationService;
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
@RestController()
@RequestMapping("application")
public class Oauth2ApplicationController extends CrudController<Oauth2Application, Long, IOauth2ApplicationService> {

}
