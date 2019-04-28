/**
 * 文件名：FCApplicationAbstractRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午5:54:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rrkj.flour.cms.entities.FCApplicationAbstract;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */

@Repository
public interface FCApplicationAbstractRepository extends CrudRepository<FCApplicationAbstract, Long> {

}
