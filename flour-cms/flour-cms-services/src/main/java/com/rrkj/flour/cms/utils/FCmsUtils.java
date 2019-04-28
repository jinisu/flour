/**
 * 文件名：FCmsUtils.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月29日 上午7:04:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.utils;

import org.apache.commons.io.FilenameUtils;
import org.springframework.http.MediaType;

import com.rrkj.flour.utils.common.StringUtil;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月29日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
public class FCmsUtils {

	public static MediaType getMediaTypefromName(String filename) {
		String extension = FilenameUtils.getExtension(filename);
		System.out.println(extension);
		if (StringUtil.isEmpty(extension)) {
			return MediaType.APPLICATION_OCTET_STREAM;
		}
		extension = extension.toLowerCase();
		if (extension.equals("html")) {
			return MediaType.TEXT_HTML;
		}
		if (extension.equals("css")) {
			return new MediaType("text", "css");
		}
		if (extension.equals("js")) {
			return new MediaType("application", "javascript");
		}
		if (extension.equals("png")) {
			return MediaType.TEXT_HTML;
		}
		if (extension.equals("html")) {
			return MediaType.TEXT_HTML;
		}
		return MediaType.APPLICATION_OCTET_STREAM;
	}

}
