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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.rrkj.flour.data.Pagination;
import com.rrkj.flour.data.StatefulEntity;
import com.rrkj.flour.data.constants.ResourceConstants;

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

	public abstract CrudRepository<T, K> getRepository();

	@Override
	public Pagination<T> queryAll(Integer pageSize, Integer page) {
		Pagination<T> pagination = new Pagination<T>();

		Iterable<T> res = this.getRepository().findAll();
		pagination.setPage(page);
		pagination.setPageSize(pageSize);

		if (res == null) {
			pagination.setContent(new ArrayList<>());
			pagination.setTotalElements(0);
		} else {
			List<T> list = new ArrayList<>();
			res.forEach(list::add);

			// TODO 假的分页
			int fromIndex = (page - 1) * pageSize;
			int toIndex = page * pageSize;
			if (toIndex > (list.size())) {
				toIndex = list.size();
			}
			pagination.setContent(list.subList(fromIndex, toIndex));
			pagination.setTotalElements(list.size());
		}
		return pagination;
	}

	@Override
	public List<T> queryByIds(List<K> ids) {
		Iterable<T> res = this.getRepository().findAllById(ids);
		if (res == null) {
			return new ArrayList<>();
		}
		List<T> target = new ArrayList<>();
		res.forEach(target::add);
		return target;
	}

	@Override
	public T queryById(K id) {
		Optional<T> optional = this.getRepository().findById(id);

		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	@Transactional
	public T create(T item) {
		return this.getRepository().save(item);
	}

	@Override
	@Transactional
	public int update(T item) {
		this.getRepository().save(item);
		return 0;
	}

	@Override
	@Transactional
	public int remove(T item) {
		// 如果是状态的话，使用status字段进行逻辑删除
		if (item instanceof StatefulEntity) {
			((StatefulEntity) item).setStatus(ResourceConstants.DELETE);
			this.getRepository().save(item);
		} else {
			this.getRepository().delete(item);
		}
		return 0;
	}

	@Override
	@Transactional
	public int removeById(K id) {
		T temp = this.queryById(id);
		if (temp != null) {
			return this.remove(temp);
		}
		return 0;
	}

}
