/**
 * 文件名：Role.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午5:59:21
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rrkj.flour.data.StatefulEntity;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Entity
@Table(name = "rrkj_flour_authorize_role")
public class Role extends StatefulEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10, nullable = false)
	private long id;

	@Column(length = 64, nullable = false)
	private String name;

	@Column(length = 64, nullable = true)
	private String title;

	@Column(length = 1024, nullable = true)
	private String icon;

	@Column(length = 1024, nullable = true)
	private String label;

	@Column(length = 1024, nullable = true)
	private String descr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
}
