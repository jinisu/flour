/**
 * 文件名：FCAttachmentController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午9:48:08
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.cms.entities.FCAttachment;
import com.rrkj.flour.cms.services.IFCAttachmentService;
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
@RequestMapping("attachment")
public class FCAttachmentController extends CrudController<FCAttachment, Long, IFCAttachmentService> {

}
