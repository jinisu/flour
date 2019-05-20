/**
 * 文件名：WebApplication.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:57:17
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rrkj.flour.data.StatefulEntity;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Entity
@Table(name = "rrkj_flour_platform_web_application")
public class WebApplication extends StatefulEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 128, nullable = false)
	private String appKey;

	@Column(length = 128, nullable = false)
	private String name;

	@Column(length = 2048, nullable = true)
	private String domain;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "rrkj_flour_platform_web_application_menu", joinColumns = @JoinColumn(name = "app_id"), inverseJoinColumns = @JoinColumn(name = "menu_id"))
	private List<MenuItem> menus;

	@Column(length = 1024, nullable = false)
	private String descr;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public List<MenuItem> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuItem> menus) {
		this.menus = menus;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
}
