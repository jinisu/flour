/**
 * 文件名：RedisCacheConfig.java
 *
 * 创建人：jinisu - jinisu@163.com
 *
 * 创建时间：2017年5月12日 上午9:08:25
 *
 * 版权所有：软软科技
 */
package com.rrkj.flour.oauth2.config;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 
 * <p> Title: [名称]</p>
 * <p> Description: [描述]</p>
 * <p> Created on 2019年4月26日</p>
 * <p> Copyright: Copyright (c) 2019</p>
 * <p> Company: 软软科技</p>
 * @author jinisu - jinisu@163.com
 * @version 1.0
 */
@Configuration
@EnableCaching // 启用缓存，这个注解很重要；
public class RedisCacheConfig extends CachingConfigurerSupport {

	private final RedisConnectionFactory redisConnectionFactory;

	RedisCacheConfig(RedisConnectionFactory redisConnectionFactory) {
		this.redisConnectionFactory = redisConnectionFactory;
	}

	@Bean
	@Qualifier("oauthCodeCache")
	@Primary
	public CacheManager cacheManager() {
		// 初始化一个RedisCacheWriter
		RedisCacheWriter cacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);

		// 设置默认过期时间：10 分钟
		RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofHours(24));
		// Map<String, RedisCacheConfiguration> caches = new HashMap<>();
		// // 缓存配置
		// RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
		// .entryTtl(Duration.ofSeconds(60))
		// .disableCachingNullValues()
		// // .prefixKeysWith("redis.service")
		// .serializeKeysWith(stringPair)
		// .serializeValuesWith(fastJsonPair);
		// caches.put("redis.service", config);
		// return new TedisCacheManager(cacheWriter, defaultCacheConfig, caches);

		return new RedisCacheManager(cacheWriter, defaultCacheConfig);
	}

	@Bean
	@Qualifier("smsCache")
	public CacheManager cacheManagerCode() {
		// 初始化一个RedisCacheWriter
		RedisCacheWriter cacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory);

		// 设置默认过期时间：10 分钟
		RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
				.entryTtl(Duration.ofMinutes(10));
		// Map<String, RedisCacheConfiguration> caches = new HashMap<>();
		// // 缓存配置
		// RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
		// .entryTtl(Duration.ofSeconds(60))
		// .disableCachingNullValues()
		// // .prefixKeysWith("redis.service")
		// .serializeKeysWith(stringPair)
		// .serializeValuesWith(fastJsonPair);
		// caches.put("redis.service", config);
		// return new TedisCacheManager(cacheWriter, defaultCacheConfig, caches);

		return new RedisCacheManager(cacheWriter, defaultCacheConfig);
	}

	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setConnectionFactory(factory);
		// key序列化方式;（不然会出现乱码;）,但是如果方法上有Long等非String类型的话，会报类型转换错误；
		// 所以在没有自己定义key生成策略的时候，以下这个代码建议不要这么写，可以不配置或者自己实现ObjectRedisSerializer
		// 或者JdkSerializationRedisSerializer序列化方式;
		// RedisSerializer<String>redisSerializer = new StringRedisSerializer();//Long类型不可以会出现异常信息;
		// redisTemplate.setKeySerializer(redisSerializer);
		// redisTemplate.setHashKeySerializer(redisSerializer);
		return redisTemplate;
	}

}
