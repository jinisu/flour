/**
 * 文件名：StatefulEntity.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午5:51:15
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.MappedSuperclass;

import com.rrkj.flour.data.constants.ResourceConstants;
import com.rrkj.flour.data.converter.LongToTimestampConverter;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@MappedSuperclass
public class StatefulEntity {

	@Column(nullable = false)
	@Convert(converter = LongToTimestampConverter.class)
	protected Long ctime = System.currentTimeMillis();

	@Column(nullable = false, insertable = false, updatable = false, columnDefinition = "timestamp default current_timestamp on update current_timestamp comment '修改时间'")
	@Convert(converter = LongToTimestampConverter.class)
	protected Long utime = System.currentTimeMillis();

	@Column(length = 3)
	protected short status = ResourceConstants.INIT;

	public Long getCtime() {
		return ctime;
	}

	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}

	public Long getUtime() {
		return utime;
	}

	public void setUtime(Long utime) {
		this.utime = utime;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}
