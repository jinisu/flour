/**
 * 文件名：LastLoginService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午10:14:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.services.impl;

import org.springframework.stereotype.Service;

import com.rrkj.flour.oauth2.entities.LastLogin;
import com.rrkj.flour.oauth2.repositories.LastLoginRepository;
import com.rrkj.flour.oauth2.services.ILastLoginService;
import com.rrkj.flour.utils.service.CrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class LastLoginService extends CrudService<LastLogin, Long, LastLoginRepository> implements ILastLoginService {

}