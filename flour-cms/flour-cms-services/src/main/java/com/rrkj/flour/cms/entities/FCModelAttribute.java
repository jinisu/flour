/**
 * 文件名：FCModelAttribute.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午5:06:28
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
@Table(name = "rrkj_flour_cms_model_attribute")
public class FCModelAttribute extends StatefulEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private long modelId;

	@Column(length = 256, nullable = false)
	private String name;

	@Column(length = 256, nullable = false)
	private String title;

	@Column(length = 1024, nullable = true)
	private String field;

	@Column(length = 32, nullable = false)
	private String type;

	@Column(length = 256, nullable = false)
	private String value;

	@Column(length = 1024, nullable = true)
	private String remark;

	@Column(length = 3, nullable = false)
	private short isDocument;

	@Column(length = 3, nullable = false)
	private short isAttachment;

	@Column(length = 3, nullable = false)
	private short isList;

	@Column(length = 3, nullable = false)
	private short isInline;

	@Column(length = 1024, nullable = true)
	private String label;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getModelId() {
		return modelId;
	}

	public void setModelId(long modelId) {
		this.modelId = modelId;
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

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public short getIsDocument() {
		return isDocument;
	}

	public void setIsDocument(short isDocument) {
		this.isDocument = isDocument;
	}

	public short getIsAttachment() {
		return isAttachment;
	}

	public void setIsAttachment(short isAttachment) {
		this.isAttachment = isAttachment;
	}

	public short getIsList() {
		return isList;
	}

	public void setIsList(short isList) {
		this.isList = isList;
	}

	public short getIsInline() {
		return isInline;
	}

	public void setIsInline(short isInline) {
		this.isInline = isInline;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
