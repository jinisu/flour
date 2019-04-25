/**
 * 文件名：Account.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月25日 下午1:57:13
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.entities;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "rrkj_flour_user_account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;

	@Column(length = 128, nullable = false)
	public String openid;

	@Column(length = 32, nullable = false)
	public String type;

	@Column(length = 128, nullable = false)
	public String uuid;

	@Column(length = 1024, nullable = true)
	public String label;

	@Column(length = 32, nullable = false)
	public long userid;

	@Column(nullable = false)
	@Convert(converter = LongToTimestampConverter.class)
	private Long ctime = System.currentTimeMillis();

	@Column(nullable = false)
	@Convert(converter = LongToTimestampConverter.class)
	private Long utime = System.currentTimeMillis();

	@Column(length = 3, nullable = false)
	public short status = 1;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

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
