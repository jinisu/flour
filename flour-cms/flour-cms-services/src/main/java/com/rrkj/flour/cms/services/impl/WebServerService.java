/**
 * 文件名：WebServerService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月28日 下午10:14:49
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rrkj.flour.cms.entities.FCApplication;
import com.rrkj.flour.cms.services.IFCApplicationService;
import com.rrkj.flour.cms.services.IWebServerService;
import com.rrkj.flour.cms.utils.FCmsUtils;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月28日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class WebServerService implements IWebServerService {

	@Autowired
	private IFCApplicationService applicationService;

	@Override
	public ResponseEntity<byte[]> doRequest(String code, String path, String requesturi) {
		// 通过code获取到application
		FCApplication ncApplication = applicationService.queryByCode(code);

		// 查看目录的结构
		String root = ncApplication.getRoot();

		String fileUrl = FilenameUtils.concat(root, path);
		// 返回结果
		String name = FilenameUtils.getName(fileUrl);

		// TODO 对于大文件的断点续传
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(FCmsUtils.getMediaTypefromName(name));
		// ContentDisposition.Builder disposition = ContentDisposition.builder("form-data").name(name).filename(name,
		// Charset.forName("UTF-8"));
		// headers.setContentDisposition(disposition.build());
		//
		try {
			return new ResponseEntity<byte[]>(IOUtils.toByteArray(new FileInputStream(new File(fileUrl))), headers,
					HttpStatus.OK);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// TODO 404
		return new ResponseEntity<byte[]>(null, headers, HttpStatus.NOT_FOUND);
	}

}
