/**
 * 文件名：FCApplication.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午5:04:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.entities;

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
@Table(name = "rrkj_flour_cms_application")
public class FCApplication extends StatefulEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private long userid;

	@Column(length = 256, nullable = false)
	private String name;

	@Column(length = 10)
	private String version = "1.0.0";

	@Column(length = 64, nullable = false)
	private String code;

	@Column(length = 64, nullable = false)
	private String indexv;

	@Column(length = 1024, nullable = false)
	private String srcDir;

	@Column(length = 3, nullable = false)
	private short publishStatus = 1;

	@Column(length = 1024, nullable = true)
	private String label;

	@Transient
	private String contentId;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIndexv() {
		return indexv;
	}

	public void setIndexv(String indexv) {
		this.indexv = indexv;
	}

	public String getSrcDir() {
		return srcDir;
	}

	public void setSrcDir(String srcDir) {
		this.srcDir = srcDir;
	}

	public short getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(short publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
}
