/**
 * 文件名：UserRepository.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午2:04:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.rrkj.flour.data.ICrudRepository;
import com.rrkj.flour.user.entities.User;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Repository
public class UserRepository implements ICrudRepository<User, Long> {

	@Override
	public User save(User entity) {
		return null;
	}

	@Override
	public Iterable<User> saveAll(Iterable<User> entities) {
		return null;
	}

	@Override
	public Optional<User> findById(Long id) {
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		return false;
	}

	@Override
	public Iterable<User> findAll() {
		return null;
	}

	@Override
	public Iterable<User> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		return 0;
	}

	@Override
	public int delete(User entity) {
		return 0;
	}

	@Override
	public int deleteAll(Iterable<User> entities) {
		return 0;
	}

	@Override
	public int deleteAll() {
		return 0;
	}

}
