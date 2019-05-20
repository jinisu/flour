/**
 * 文件名：TRoleService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午10:04:48
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.grpc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rrkj.flour.authorize.api.ListTPermission;
import com.rrkj.flour.authorize.api.ListTPermission.Builder;
import com.rrkj.flour.authorize.api.ListTRole;
import com.rrkj.flour.authorize.api.RoleGrpcServiceGrpc;
import com.rrkj.flour.authorize.api.TRole;
import com.rrkj.flour.authorize.entities.Permission;
import com.rrkj.flour.authorize.entities.Role;
import com.rrkj.flour.authorize.services.IPermissionService;
import com.rrkj.flour.authorize.services.IRoleService;

import net.devh.boot.grpc.server.service.GrpcService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月20日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@GrpcService
public class TRoleService extends RoleGrpcServiceGrpc.RoleGrpcServiceImplBase {

	@Autowired
	private IRoleService service;

	@Autowired
	private IPermissionService pservice;

	/**
	*/
	public void queryById(com.rrkj.flour.authorize.api.TId request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TRole> responseObserver) {

		Role role = service.queryById(request.getId());

		TRole trole = this._Role2TRole(role);

		responseObserver.onNext(trole);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {
		List<Permission> permission = pservice.queryByRoleid(request.getId());

		ListTPermission list = null;
		if (permission != null && permission.size() > 0) {
			Builder builder = ListTPermission.newBuilder();
			for (int i = 0, n = permission.size(); i < n; i++) {
				builder.addList(TPermissionService._Permission2TPermission(permission.get(i)));
			}
			list = builder.build();
		}
		responseObserver.onNext(list);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void queryByUserid(com.rrkj.flour.authorize.api.TId request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTRole> responseObserver) {

		List<Role> roles = service.queryByUserid(request.getId());

		ListTRole list = null;
		if (roles != null && roles.size() > 0) {
			ListTRole.Builder builder = ListTRole.newBuilder();
			for (int i = 0, n = roles.size(); i < n; i++) {
				builder.addList(this._Role2TRole(roles.get(i)));
			}
			list = builder.build();
		}

		responseObserver.onNext(list);
		responseObserver.onCompleted();
	}

	private TRole _Role2TRole(Role item) {
		if (item == null) {
			return null;
		}
		return TRole.newBuilder().setId(item.getId()).setName(item.getName()).setTitle(item.getTitle())
				.setIcon(item.getIcon()).setLabel(item.getLabel()).setDescr(item.getDescr()).setCtime(item.getCtime())
				.setUtime(item.getUtime()).setStatus(item.getStatus()).build();
	}
}
