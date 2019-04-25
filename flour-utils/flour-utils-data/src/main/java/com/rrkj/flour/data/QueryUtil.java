/**
 * 文件名：QueryUtil.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午1:46:18
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.data;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public class QueryUtil {

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2019年4月25日
	 * @author: jinisu - jinisu@163.com
	 * @update: 2019年4月25日 下午1:48:14  suhs
	 */
	public static <T> T queryOne(JdbcTemplate jdbcTemplate, String sql, Object[] args, RowMapper<T> mapper) {
		//
		List<T> res = jdbcTemplate.query(sql, args, mapper);
		if (res == null || res.size() <= 0) {
			return null;
		}
		//
		T one = res.get(0);
		return one;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2019年4月25日
	 * @author: jinisu - jinisu@163.com
	 * @update: 2019年4月25日 下午1:55:06  suhs
	 */
	public static <T> T queryOne(JdbcTemplate jdbcTemplate, String sql, Object[] args, Class<T> requiredType) {
		//
		List<T> res = jdbcTemplate.queryForList(sql, args, requiredType);
		if (res == null || res.size() <= 0) {
			return null;
		}
		//
		T one = res.get(0);
		return one;
	}
}
