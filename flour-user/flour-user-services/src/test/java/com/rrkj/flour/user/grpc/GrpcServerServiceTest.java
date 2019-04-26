/**
 * 文件名：GrpcServerServiceTest.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 上午8:16:41
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.user.grpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rrkj.flour.user.FlourUserApplication;
import com.rrkj.flour.user.api.HelloRequest;
import com.rrkj.flour.user.api.UserServiceGrpc.UserServiceBlockingStub;

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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FlourUserApplication.class)
public class GrpcServerServiceTest {

	@GrpcClient("dns:/user-service:7911")
	private UserServiceBlockingStub greeterStub;

//	@Test
	public void test() {
		greeterStub.sayHello(HelloRequest.newBuilder().setName("dddddddd").build());
	}
}
