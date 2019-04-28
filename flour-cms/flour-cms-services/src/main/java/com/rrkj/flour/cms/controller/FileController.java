/**
 * 文件名：FileController.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月29日 上午7:09:16
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.controller;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rrkj.flour.cms.services.IFileService;
import com.rrkj.flour.cms.services.bo.SingleFileUploadResponse;
import com.rrkj.flour.utils.common.Pair;
import com.rrkj.flour.utils.web.exception.ExceptionCode;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月29日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@RestController
@RequestMapping("file")
public class FileController {

	@Autowired
	private IFileService service;

	@RequestMapping("singleUpload")
	public SingleFileUploadResponse singleFileUpload(@RequestPart("upload") MultipartFile file,
			HttpServletRequest request) {

		try {
			return service.singleFileUpload(file.getOriginalFilename(), file.getBytes());
		} catch (IOException e) {
			// TODO
			e.printStackTrace();
		}
		SingleFileUploadResponse res = new SingleFileUploadResponse();
		res.setUploaded(false);
		res.setUrl("");
		return res;
	}

	@RequestMapping("imageUpload")
	public com.rrkj.flour.utils.web.ResponseEntity<SingleFileUploadResponse> imageUpload(
			@RequestPart("file") MultipartFile file, HttpServletRequest request) {
		com.rrkj.flour.utils.web.ResponseEntity<SingleFileUploadResponse> res = new com.rrkj.flour.utils.web.ResponseEntity<>();
		SingleFileUploadResponse resData;
		try {
			resData = service.singleFileUpload(file.getOriginalFilename(), file.getBytes());
			res.setData(resData);
		} catch (IOException e) {
			e.printStackTrace();
			res.setCode(ExceptionCode.BUSINESS_ERROR & 1);
		}
		return res;
	}

	@RequestMapping("/download/{path}/{file}")
	public ResponseEntity<byte[]> download(@PathVariable("path") String path, @PathVariable("file") String fileName)
			throws IOException {

		Pair<String, byte[]> file = service.download(path, fileName);
		if (file == null) {
			throw new IOException("无法找到指定的数据！");
		}
		// TODO 大文件，音视频文件等的断点续传
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		ContentDisposition.Builder disposition = ContentDisposition.builder("form-data").name(file.first)
				.filename(file.first, Charset.forName("UTF-8"));
		headers.setContentDisposition(disposition.build());
		return new ResponseEntity<byte[]>(file.second, headers, HttpStatus.OK);
	}
}
