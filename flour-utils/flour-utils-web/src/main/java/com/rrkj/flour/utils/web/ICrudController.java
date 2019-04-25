/**
 * 文件名：ICurdController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:24:48
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web;

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
public interface ICrudController<T, K> {

	public ResponseEntity<Pagination<T>> queryAll(Integer pageSize, Integer page);

	public ResponseEntity<List<T>> queryByIds(List<K> ids);

	public ResponseEntity<T> queryById(K id);

	public ResponseEntity<T> create(T item);

	public ResponseEntity<Integer> update(T item);

	public ResponseEntity<Integer> remove(T item);

	public ResponseEntity<Integer> removeById(K id);
}
