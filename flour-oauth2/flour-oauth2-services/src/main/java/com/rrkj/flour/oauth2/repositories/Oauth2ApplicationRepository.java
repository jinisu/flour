/**
 * 文件名：Oauth2ApplicationRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午9:42:34
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.oauth2.entities.Oauth2Application;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Repository
public interface Oauth2ApplicationRepository extends CrudRepository<Oauth2Application, Long> {

}
