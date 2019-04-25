/**
 * 文件名：AccountRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:05:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rrkj.flour.user.entities.Account;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

}