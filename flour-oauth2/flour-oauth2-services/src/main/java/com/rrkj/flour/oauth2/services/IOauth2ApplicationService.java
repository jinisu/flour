/**
 * 文件名：IOauth2Application.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午9:45:42
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services;

import com.rrkj.flour.oauth2.entities.Oauth2Application;
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
public interface IOauth2ApplicationService extends ICrudService<Oauth2Application, Long> {

	public Oauth2Application findByAppKey(String clientId);

	public Oauth2Application findByAppSecret(String clientSecret);
}