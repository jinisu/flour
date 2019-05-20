/**
 * 文件名：MenuService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:54:44
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web.services.impl;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrkj.flour.authorize.api.ListTPermission;
import com.rrkj.flour.authorize.api.PermissionGrpcServiceGrpc.PermissionGrpcServiceBlockingStub;
import com.rrkj.flour.authorize.api.TIdAndString;
import com.rrkj.flour.platform.web.entities.WebApplication;
import com.rrkj.flour.platform.web.services.IMenuService;
import com.rrkj.flour.platform.web.services.IWebApplicationService;

import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class MenuService implements IMenuService {

	@GrpcClient("authorize-service")
	private PermissionGrpcServiceBlockingStub permissionStub;

	@Autowired
	private IWebApplicationService webappService;

	@Override
	public WebApplication queryAllMenu(long userid, Long roleid, String appKey, String domain) {
		// 获取用户的权限，
		WebApplication webapp = webappService.queryByAppKeyAndDomain(appKey, domain);
		try {
			// 获取应用的菜单
			ListTPermission tplist = permissionStub
					.queryPermissionByRoleidAndAppKey(TIdAndString.newBuilder().setId(roleid).setStr(appKey).build());
			System.out.println(tplist.getListCount());

			if (tplist.getListCount() > 0 && webapp.getMenus().size() > 0) {
				Set<String> codes = tplist.getListList().stream().map(r -> r.getPermission())
						.collect(Collectors.toSet());
				webapp.setMenus(webapp.getMenus().stream().filter(r -> {
					return codes.contains(r.getCode());
				}).collect(Collectors.toList()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return webapp;
	}

}
