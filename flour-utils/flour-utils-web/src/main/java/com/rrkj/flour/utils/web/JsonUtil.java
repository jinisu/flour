/**
 * 文件名：JsonUtil.java
 *
 * 创建人：suhs - jinisu@163.com
 *
 * 创建时间：2018年1月26日 上午8:47:27
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.utils.web;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2018年1月26日</p>
 * <p> Copyright: Copyright (c) 2015</p>
 * <p> Company: 软软科技</p>
 * @author suhs - jinisu@163.com
 * @version 1.0
 */
public class JsonUtil {

	private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

	private static ObjectMapper objectMapper;

	/**
	 * 懒惰单例模式得到ObjectMapper实例
	 * 此对象为Jackson的核心
	 */
	private static ObjectMapper getMapper() {
		if (objectMapper == null) {
			objectMapper = new ObjectMapper();
		}
		return objectMapper;
	}

	/**
	 * 创建JSON处理器的静态方法
	 * @param content JSON字符串
	 * @return
	 */
	private static JsonParser getParser(String content) {
		try {
			return getMapper().getFactory().createParser(content);
		} catch (IOException ioe) {
			return null;
		}
	}

	/**
	 * 创建JSON生成器的静态方法, 使用标准输出
	 * @return
	 */
	private static JsonGenerator getGenerator(StringWriter sw) {
		try {
			return getMapper().getFactory().createGenerator(sw);
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * JSON对象序列化
	 */
	public static String toJSON(Object obj) {
		if (obj == null) {
			return "";
		}
		StringWriter sw = new StringWriter();
		JsonGenerator jsonGen = getGenerator(sw);
		if (jsonGen == null) {
			try {
				sw.close();
			} catch (IOException e) {
			}
			return null;
		}
		try {
			// 由于在getGenerator方法中指定了OutputStream为sw
			// 因此调用writeObject会将数据输出到sw
			jsonGen.writeObject(obj);
			// 由于采用流式输出 在输出完毕后务必清空缓冲区并关闭输出流
			jsonGen.flush();
			jsonGen.close();
			return sw.toString();
		} catch (JsonGenerationException jge) {
			logger.error("JSON fail" + jge.getMessage(), jge);
		} catch (IOException ioe) {
			logger.error("JSON IO:" + ioe.getMessage(), ioe);
		}
		return null;
	}

	/**
	 * JSON对象反序列化
	 */
	public static <T> T fromJSON(String json, Class<T> clazz) {
		try {
			JsonParser jp = getParser(json);

			return jp.readValueAs(clazz);
		} catch (JsonParseException jpe) {
			logger.error(String.format("Serializer fail:%s", jpe.getMessage()), jpe);
		} catch (JsonMappingException jme) {
			logger.error(String.format("Serializer fail:%s", jme.getMessage()), jme);
		} catch (IOException ioe) {
			logger.error(String.format("Serializer fail:%s", ioe.getMessage()), ioe);
		}
		return null;
	}

	public static <T> T fromJSONTree(String json) {
		try {
			JsonParser jp = getParser(json);
			return jp.readValueAsTree();
		} catch (JsonParseException jpe) {
			logger.error(String.format("Serializer fail:%s", jpe.getMessage()), jpe);
		} catch (JsonMappingException jme) {
			logger.error(String.format("Serializer fail:%s", jme.getMessage()), jme);
		} catch (IOException ioe) {
			logger.error(String.format("Serializer fail:%s", ioe.getMessage()), ioe);
		}
		return null;
	}

	/**
	 * 
	 * <p>Description:[方法功能中文描述]</p>
	 * Created on 2015年9月16日
	 * @author: suhs - jinisu@163.com
	 * @update: 2015年9月16日 上午10:52:51  suhs
	 */
	public static Object queryMapFromPath(Object obj, String path) {
		if (!(obj instanceof Map)) {
			return null;
		}
		Object src = obj;
		String[] paths = path.split("\\.");
		Object res = null;

		for (int i = 0; i < paths.length; i++) {
			String pathTemp = paths[i];
			if (null == pathTemp) {
				break;
			}
			if (src instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, Object> mapSrc = (Map<String, Object>) src;
				if (mapSrc.containsKey(pathTemp)) {
					res = mapSrc.get(pathTemp);
				}
				src = res;
			} else {
				break;
			}
		}

		return res;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void setMapValues(Map<String, Object> parent, String path, Object value) {

		Object src = parent;
		String[] paths = path.split("\\.");
		Object res = parent;

		for (int i = 0; i < paths.length - 1; i++) {
			String pathTemp = paths[i];
			if (null == pathTemp) {
				break;
			}
			if (src instanceof Map) {
				Map<String, Object> mapSrc = (Map<String, Object>) src;
				if (mapSrc.containsKey(pathTemp)) {
					res = mapSrc.get(pathTemp);
					if (res instanceof Map) {

					} else {
						res = new HashMap<>();
						mapSrc.put(pathTemp, res);
					}
				} else {
					res = new HashMap<>();
					mapSrc.put(pathTemp, res);
				}
				src = res;
			} else {
				break;
			}
		}
		if (res != null) {
			if (res instanceof Map) {
				((Map) res).put(paths[paths.length - 1], value);
			}
		}

		return;
	}
}
