/**
 * 文件名：FileService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月29日 上午7:21:54
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rrkj.flour.cms.services.IFileService;
import com.rrkj.flour.cms.services.bo.SingleFileUploadResponse;
import com.rrkj.flour.utils.common.IDGenerator;
import com.rrkj.flour.utils.common.Pair;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月29日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Service
public class FileService implements IFileService {

	@Value("${ncms.file.path}")
	private String fileRoot = "/user/local/flour/cms";

	@Value("${ncms.file.server}")
	private String httpServerUrl = "/services/cms-service/1.0/file/download/";

	private int maxFileSize = 40000;

	@Override
	public SingleFileUploadResponse singleFileUpload(String filename, byte[] file) throws IOException {
		SingleFileUploadResponse res = new SingleFileUploadResponse();
		// TODO 保存文件
		String pathString = this.getDirName();

		// 获取后缀
		String extension = FilenameUtils.getExtension(filename);
		String fileName = IDGenerator.generateId() + "." + extension;
		File subFile = new File(FilenameUtils.concat(FilenameUtils.concat(this.fileRoot, pathString), fileName));

		IOUtils.write(file, new FileOutputStream(subFile));

		res.setUploaded(true);
		res.setUrl(this.httpServerUrl + pathString + "/" + URLEncoder.encode(fileName, "UTF-8"));
		return res;
	}

	private String getDirName() {
		File parent = new File(this.fileRoot);

		long fileCount = parent.list().length;
		// 得到文件名称
		if (fileCount > 0) {
			// 判断是否文件超出了限制
			String subDirName = String.format("%05d", fileCount);
			File subFile = new File(FilenameUtils.concat(this.fileRoot, subDirName + "/"));
			if (!subFile.exists()) {
				subFile.mkdirs();
			}
			if (subFile.list() == null || subFile.list().length < this.maxFileSize) {
				// 文件数没有超
				return subDirName;
			}
			fileCount++;
		} else {
			fileCount++;
		}
		String subDirName = String.format("%05d", fileCount);
		File subFile = new File(FilenameUtils.concat(this.fileRoot, subDirName + "/"));
		subFile.mkdirs();
		return subDirName;
	}

	@Override
	public Pair<String, byte[]> download(String path, String fileName) throws IOException {
		File file = new File(FilenameUtils.concat(FilenameUtils.concat(this.fileRoot, path), fileName));
		Pair<String, byte[]> res = new Pair<>(file.getName(), IOUtils.toByteArray(new FileInputStream(file)));
		return res;
	}

	@Override
	public byte[] serviceDownload(String path) throws IOException {
		String filePath = path.substring(this.httpServerUrl.length());
		File subFile = new File(FilenameUtils.concat(this.fileRoot, filePath));

		return IOUtils.toByteArray(new FileInputStream(subFile));
	}

	@Override
	public boolean serviceRemove(String path) throws IOException {
		String filePath = path.substring(this.httpServerUrl.length());
		File subFile = new File(FilenameUtils.concat(this.fileRoot, filePath));

		return subFile.delete();
	}

}
