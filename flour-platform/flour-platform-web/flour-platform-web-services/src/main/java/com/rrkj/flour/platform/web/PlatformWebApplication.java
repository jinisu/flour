/**
 * 文件名：PlatformWebApplication.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年5月17日 下午6:33:18
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.platform.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年5月17日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = { " com.rrkj.flour.platform.web", "com.rrkj.flour.utils.web.config" })
public class PlatformWebApplication {

	/**
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2019年5月17日
	 * @author: jinisu - jinisu@163.com
	 * @update: 2019年5月17日 下午6:33:18  suhs
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PlatformWebApplication.class);
		app.run(args);
	}

}
