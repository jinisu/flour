/**
 * 文件名：LongToTimestampConverter.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2018年9月5日 上午8:00:31
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.data.converter;

import java.sql.Timestamp;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * 
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月25日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Converter
public class LongToTimestampConverter implements AttributeConverter<Long, Timestamp> {

	@Override
	public Timestamp convertToDatabaseColumn(Long attribute) {
		if (attribute == null) {
			return null;
		}
		return new Timestamp(attribute);
	}

	@Override
	public Long convertToEntityAttribute(Timestamp dbData) {
		if (dbData == null) {
			return null;
		}
		return dbData.getTime();
	}

}
