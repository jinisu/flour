/**
 * 文件名：TUserService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午10:05:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.grpc;

import org.springframework.beans.factory.annotation.Autowired;

import com.rrkj.flour.user.api.ListUser;
import com.rrkj.flour.user.api.TId;
import com.rrkj.flour.user.api.TNameAndLabel;
import com.rrkj.flour.user.api.TRBool;
import com.rrkj.flour.user.api.TString;
import com.rrkj.flour.user.api.TUser;
import com.rrkj.flour.user.api.TUser.GenderType;
import com.rrkj.flour.user.api.UserGrpcServiceGrpc;
import com.rrkj.flour.user.entities.User;
import com.rrkj.flour.user.services.IUserService;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@GrpcService
public class TUserService extends UserGrpcServiceGrpc.UserGrpcServiceImplBase {

	@Autowired
	private IUserService service;

	/**
	 */
	public void queryByUuid(TString request, StreamObserver<TUser> responseObserver) {
		String uuid = request.getStr();
		// TODO
	}

	/**
	 */
	public void queryByPhone(TString request, StreamObserver<ListUser> responseObserver) {
		String phone = request.getStr();
		// TODO
	}

	/**
	 */
	public void queryById(TId request, StreamObserver<TUser> responseObserver) {
		User user = service.queryById(request.getId());

		TUser tuser = null;

		if (user != null) {
			tuser = this.userToTuser(user);
		}
		responseObserver.onNext(tuser);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void queryByUser(TUser request, StreamObserver<ListUser> responseObserver) {
		// TODO
	}

	/**
	 */
	public void queryByNameAndLabel(TNameAndLabel request, StreamObserver<ListUser> responseObserver) {
		// TODO
	}

	/**
	 */
	public void create(TUser request, StreamObserver<TUser> responseObserver) {
		responseObserver.onNext(userToTuser(service.create(tuserTouser(request))));
		responseObserver.onCompleted();
	}

	/**
	 */
	public void update(TUser request, StreamObserver<TUser> responseObserver) {
		service.update(tuserTouser(request));

		responseObserver.onNext(request);
		responseObserver.onCompleted();
	}

	/**
	 */
	public void removeById(TId request, StreamObserver<TRBool> responseObserver) {
		service.removeById(request.getId());
		responseObserver.onNext(TRBool.newBuilder().setRes(true).build());
		responseObserver.onCompleted();

	}

	private TUser userToTuser(User user) {
		if (user == null) {
			return null;
		}
		return TUser.newBuilder().setId(user.getId()).setName(user.getName()).setNickname(user.getNickname())
				.setType(user.getType()).setUid(user.getUuid()).setIcon(user.getIcon()).setPhone(user.getPhone())
				.setEmail(user.getEmail()).setBirthday(user.getBirthday())
				.setGender(user.getGender() == 1 ? GenderType.NAN : GenderType.NV).setLabel(user.getLabel())
				.setCtime(user.getCtime()).setUtime(user.getUtime()).setStatus(user.getStatus()).build();
	}

	private User tuserTouser(TUser user) {
		if (user == null) {
			return null;
		}
		User to = new User();
		to.setId(user.getId());
		to.setBirthday(user.getBirthday());
		to.setEmail(user.getEmail());
		to.setIcon(user.getIcon());
		to.setName(user.getName());
		to.setNickname(user.getNickname());
		to.setPhone(user.getPhone());
		to.setGender(user.getGenderValue());
		to.setLabel(user.getLabel());
		to.setStatus((short) user.getStatus());
		to.setType(user.getType());
		to.setUuid(user.getUid());
		to.setCtime(user.getCtime());
		to.setUtime(user.getUtime());
		return to;
	}
}
