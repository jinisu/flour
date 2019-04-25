/**
 * 文件名：CrudService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:21:53
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.service;

import java.util.List;

import com.rrkj.flour.data.ICrudRepository;
import com.rrkj.flour.data.Pagination;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public abstract class CrudService<T, K> implements ICrudService<T, K> {

	public abstract ICrudRepository<T, K> getRepository();

	@Override
	public Pagination<T> queryAll(Integer pageSize, Integer page) {
		return null;
	}

	@Override
	public List<T> queryByIds(List<K> ids) {
		return null;
	}

	@Override
	public T queryById(K id) {
		return null;
	}

	@Override
	public T create(T item) {
		return null;
	}

	@Override
	public int update(T item) {
		return 0;
	}

	@Override
	public int remove(T item) {
		return 0;
	}

	@Override
	public int removeById(K id) {
		return 0;
	}

}
