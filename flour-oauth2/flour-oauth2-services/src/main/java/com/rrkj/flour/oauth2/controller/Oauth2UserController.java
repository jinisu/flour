/**
 * 文件名：Oauth2UserController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午10:17:33
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrkj.flour.oauth2.entities.Oauth2User;
import com.rrkj.flour.oauth2.services.IOauth2UserService;
//import com.rrkj.flour.user.api.HelloReply;
//import com.rrkj.flour.user.api.HelloRequest;
//import com.rrkj.flour.user.api.UserServiceGrpc.UserServiceBlockingStub;
import com.rrkj.flour.utils.web.CrudController;

import net.devh.boot.grpc.client.inject.GrpcClient;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController()
@RequestMapping("user")
public class Oauth2UserController extends CrudController<Oauth2User, Long, IOauth2UserService> {

//	@GrpcClient("user-service")
//	private UserServiceBlockingStub greeterStub;
//
//	@RequestMapping("test")
//	public String test() {
//		HelloReply reply = greeterStub.sayHello(HelloRequest.newBuilder().setName("dddddddd").build());
//
//		if (reply == null) {
//			return "null";
//		}
//		return reply.getMessage();
//	}
}
