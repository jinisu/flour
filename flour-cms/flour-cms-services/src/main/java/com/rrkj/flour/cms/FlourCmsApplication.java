/**
 * 文件名：FlourCmsApplication.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月26日 下午6:13:55
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms;

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
@SpringBootApplication(scanBasePackages = { "com.rrkj.flour.cms", "com.rrkj.flour.utils.web.config" })
public class FlourCmsApplication {

	/**
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2019年4月26日
	 * @author: jinisu - jinisu@163.com
	 * @update: 2019年4月26日 下午6:13:55  suhs
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FlourCmsApplication.class);
		app.run(args);
	}

}
