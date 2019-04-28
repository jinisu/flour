/**
 * 文件名：FCModel.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午5:05:52
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.rrkj.flour.data.StatefulEntity;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Entity
@Table(name = "rrkj_flour_cms_model")
public class FCModel extends StatefulEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private long userid;

	@Column
	private int version = 0;

	@Column(length = 256, nullable = false)
	private String name;

	@Column(length = 256, nullable = false)
	private String tableName;

	@Column(length = 3, nullable = false)
	private short tableCreated;

	@Column(length = 1024, nullable = true)
	private String label;

	@Transient
	private List<FCModelAttribute> attributes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public short getTableCreated() {
		return tableCreated;
	}

	public void setTableCreated(short tableCreated) {
		this.tableCreated = tableCreated;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<FCModelAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<FCModelAttribute> attributes) {
		this.attributes = attributes;
	}
}
