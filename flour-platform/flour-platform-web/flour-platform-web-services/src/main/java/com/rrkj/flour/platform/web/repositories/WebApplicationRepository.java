/**
 * 文件名：WebApplicationRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午8:30:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.platform.web.entities.WebApplication;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月20日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Repository
public interface WebApplicationRepository extends CrudRepository<WebApplication, Long> {

}