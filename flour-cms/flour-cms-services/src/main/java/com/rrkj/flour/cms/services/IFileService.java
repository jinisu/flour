/**
 * 文件名：IFileService.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2019年4月29日 上午7:10:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.cms.services;

import java.io.IOException;

import com.rrkj.flour.cms.services.bo.SingleFileUploadResponse;
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
public interface IFileService {

	public SingleFileUploadResponse singleFileUpload(String filename, byte[] file) throws IOException;

	public Pair<String, byte[]> download(String path, String fileName) throws IOException;

	public byte[] serviceDownload(String path) throws IOException;

	public boolean serviceRemove(String path) throws IOException;

}
