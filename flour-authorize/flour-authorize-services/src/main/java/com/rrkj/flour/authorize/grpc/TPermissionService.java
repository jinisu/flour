/**
 * 文件名：TPermissionService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 上午10:00:48
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize.grpc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rrkj.flour.authorize.api.ListTPermission;
import com.rrkj.flour.authorize.api.ListTPermission.Builder;
import com.rrkj.flour.authorize.api.PermissionGrpcServiceGrpc;
import com.rrkj.flour.authorize.api.TPermission;
import com.rrkj.flour.authorize.entities.Permission;
import com.rrkj.flour.authorize.services.IPermissionService;

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
public class TPermissionService extends PermissionGrpcServiceGrpc.PermissionGrpcServiceImplBase {

	@Autowired
	private IPermissionService service;

	/**
	*/
	public void queryById(com.rrkj.flour.authorize.api.TId request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.TPermission> responseObserver) {

		Permission permission = service.queryById(request.getId());

		TPermission tpermisson = this._Permission2TPermission(permission);
		responseObserver.onNext(tpermisson);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void queryPermissionByRoleidAndAppKey(com.rrkj.flour.authorize.api.TIdAndString request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {

		List<Permission> permission = service.queryByRoleidAndAppKey(request.getId(), request.getStr());

		ListTPermission list = null;
		Builder builder = ListTPermission.newBuilder();

		if (permission != null && permission.size() > 0) {

			for (int i = 0, n = permission.size(); i < n; i++) {
				builder.addList(this._Permission2TPermission(permission.get(i)));
			}
		}
		list = builder.build();
		responseObserver.onNext(list);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void queryPermissionByRoleid(com.rrkj.flour.authorize.api.TId request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.authorize.api.ListTPermission> responseObserver) {

		List<Permission> permission = service.queryByRoleid(request.getId());

		ListTPermission list = null;
		if (permission != null && permission.size() > 0) {
			Builder builder = ListTPermission.newBuilder();
			for (int i = 0, n = permission.size(); i < n; i++) {
				builder.addList(this._Permission2TPermission(permission.get(i)));
			}
			list = builder.build();
		}
		responseObserver.onNext(list);
		responseObserver.onCompleted();
	}

	protected static TPermission _Permission2TPermission(Permission item) {

		if (item == null) {
			return null;
		}
		return TPermission.newBuilder().setId(item.getId()).setName(item.getName()).setPtype(item.getPtype())
				.setPermission(item.getPermission()).setLabel(item.getLabel()).setDescr(item.getDescr())
				.setCtime(item.getCtime()).setUtime(item.getUtime()).setStatus(item.getStatus()).build();
	}

}
