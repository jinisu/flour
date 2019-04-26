/**
 * 文件名：CurdController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:27:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.data.Pagination;
import com.rrkj.flour.utils.service.ICrudService;
import com.rrkj.flour.utils.web.exception.ExceptionCode;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController
@RequestMapping(value = "")
public class CrudController<T, K, S extends ICrudService<T, K>> implements ICrudController<T, K> {

	@Autowired
	protected S service;

	public ICrudService<T, K> getService() {
		return service;
	}

	@Override
	@RequestMapping(value = "queryAll")
	public ResponseEntity<Pagination<T>> queryAll(Integer pageSize, Integer page) {
		ResponseEntity<Pagination<T>> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		Pagination<T> p = this.getService().queryAll(pageSize, page);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "queryByIds", method = RequestMethod.POST)
	public ResponseEntity<List<T>> queryByIds(@RequestBody List<K> ids) {
		ResponseEntity<List<T>> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		List<T> p = this.getService().queryByIds(ids);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "queryById")
	public ResponseEntity<T> queryById(@RequestParam("id") K id) {
		ResponseEntity<T> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		T p = this.getService().queryById(id);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ResponseEntity<T> create(@RequestBody T item) {
		ResponseEntity<T> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		T p = this.getService().create(item);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ResponseEntity<Integer> update(@RequestBody T item) {
		ResponseEntity<Integer> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		Integer p = this.getService().update(item);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "remove", method = RequestMethod.POST)
	public ResponseEntity<Integer> remove(@RequestBody T item) {
		ResponseEntity<Integer> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		Integer p = this.getService().remove(item);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

	@Override
	@RequestMapping(value = "removeById")
	public ResponseEntity<Integer> removeById(@RequestParam("id") K id) {
		ResponseEntity<Integer> res = new ResponseEntity<>();

		// service判断
		if (this.getService() == null) {
			res.setCode(ExceptionCode.SYSTEM_ERROR);
			res.setMessage(String.format("get service %s is null!", this.getClass().getName()));
			return res;
		}

		int p = this.getService().removeById(id);
		res.setCode(ExceptionCode.SUCCESS);
		res.setData(p);

		return res;
	}

}
