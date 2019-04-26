/**
 * 文件名：AuthorizeApplication.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午5:56:09
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.authorize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = { "com.rrkj.flour.authorize", "com.rrkj.flour.utils.web.config" })
public class AuthorizeApplication {

	/**
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2019年4月25日
	 * @author: jinisu - jinisu@163.com
	 * @update: 2019年4月25日 上午11:51:14  suhs
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AuthorizeApplication.class);
		app.run(args);
	}
}
