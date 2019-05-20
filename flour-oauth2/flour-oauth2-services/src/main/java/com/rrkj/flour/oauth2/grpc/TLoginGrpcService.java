/**
 * 文件名：TLoginGrpcService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月20日 下午1:54:27
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.grpc;

import org.springframework.beans.factory.annotation.Autowired;

import com.rrkj.flour.oauth2.api.LoginGrpcServiceGrpc;
import com.rrkj.flour.oauth2.api.TLoginResponse;
import com.rrkj.flour.oauth2.services.ILoginService;
import com.rrkj.flour.oauth2.services.bo.LoginResponse;

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
public class TLoginGrpcService extends LoginGrpcServiceGrpc.LoginGrpcServiceImplBase {

	@Autowired
	private ILoginService service;

	/**
	*/
	public void checkAccessToken(com.rrkj.flour.oauth2.api.TString request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {

		LoginResponse response = service.checkAcessToken(request.getStr());

		responseObserver.onNext(TLoginResponse.newBuilder().setCode(response.getCode())
				.setMessage(response.getMessage()).setAccessToken(response.getAccessToken())
				.setUserid(response.getUserid()).setUsername(response.getUsername()).build());
		responseObserver.onCompleted();
	}

	/**
	 */
	public void login(com.rrkj.flour.oauth2.api.LoginRequest request,
			io.grpc.stub.StreamObserver<com.rrkj.flour.oauth2.api.TLoginResponse> responseObserver) {

		LoginResponse response = service.loginByUsernameAndPassword(request.getUsername(), request.getPassword());

		responseObserver.onNext(TLoginResponse.newBuilder().setCode(response.getCode())
				.setMessage(response.getMessage()).setAccessToken(response.getAccessToken())
				.setUserid(response.getUserid()).setUsername(response.getUsername()).build());
		responseObserver.onCompleted();
	}
}
