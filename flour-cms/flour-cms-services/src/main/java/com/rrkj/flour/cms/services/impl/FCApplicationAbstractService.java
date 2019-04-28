/**
 * 文件名：FCApplicationAbstractService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午9:09:59
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services.impl;

import org.springframework.stereotype.Service;

import com.rrkj.flour.cms.entities.FCApplicationAbstract;
import com.rrkj.flour.cms.repositories.FCApplicationAbstractRepository;
import com.rrkj.flour.cms.services.IFCApplicationAbstractService;
import com.rrkj.flour.utils.service.CrudService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class FCApplicationAbstractService
		extends CrudService<FCApplicationAbstract, Long, FCApplicationAbstractRepository>
		implements IFCApplicationAbstractService {

}
