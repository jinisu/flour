/**
 * 文件名：ICrudRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午3:27:11
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.data;

import java.util.Optional;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public interface ICrudRepository<S, K> {

	S save(S entity);

	Iterable<S> saveAll(Iterable<S> entities);

	Optional<S> findById(K id);

	boolean existsById(K id);

	Iterable<S> findAll();

	Iterable<S> findAllById(Iterable<K> ids);

	long count();

	int deleteById(K id);

	int delete(S entity);

	int deleteAll(Iterable<S> entities);

	int deleteAll();

}
