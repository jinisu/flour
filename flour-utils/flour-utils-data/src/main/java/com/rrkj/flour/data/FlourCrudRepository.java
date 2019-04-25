/**
 * 文件名：FlourCrudRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午4:24:49
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
public class FlourCrudRepository<T, K> implements ICrudRepository<T, K> {

	@Override
	public T save(T entity) {
		return null;
	}

	@Override
	public Iterable<T> saveAll(Iterable<T> entities) {
		return null;
	}

	@Override
	public Optional<T> findById(K id) {
		return null;
	}

	@Override
	public boolean existsById(K id) {
		return false;
	}

	@Override
	public Iterable<T> findAll() {
		return null;
	}

	@Override
	public Iterable<T> findAllById(Iterable<K> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public int deleteById(K id) {
		return 0;
	}

	@Override
	public int delete(T entity) {
		return 0;
	}

	@Override
	public int deleteAll(Iterable<T> entities) {
		return 0;
	}

	@Override
	public int deleteAll() {
		return 0;
	}

}
