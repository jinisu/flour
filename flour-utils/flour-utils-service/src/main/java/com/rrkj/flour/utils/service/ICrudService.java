/**
 * 文件名：ICrudService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:09:55
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.service;

import java.util.List;

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
public interface ICrudService<T, K> {

	public Pagination<T> queryAll(Integer pageSize, Integer page);

	public List<T> queryByIds(List<K> ids);

	public T queryById(K id);

	public T create(T item);

	public int update(T item);

	public int remove(T item);

	public int removeById(K id);

}
