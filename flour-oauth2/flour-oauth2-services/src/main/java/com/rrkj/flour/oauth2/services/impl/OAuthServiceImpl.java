package com.rrkj.flour.oauth2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.rrkj.flour.oauth2.services.IOAuthService;

@Service("OAuthServiceImpl")
public class OAuthServiceImpl implements IOAuthService {

	private Cache cache;

	@Autowired
	private Oauth2ApplicationService clientService;

	@Value("${oauth.expirein}")
	private long expireIn = 3600L;

	@Autowired
	@Qualifier("oauthCodeCache")
	private CacheManager cacheManager;

	public Cache getCache() {
		if (this.cache == null) {
			this.cache = cacheManager.getCache("oauth-code-cache");
		}
		return this.cache;
	}

	@Override
	public void addAuthCode(String authCode, String username) {
		getCache().put(authCode, username);
	}

	@Override
	public void addAccessToken(String accessToken, String username) {
		getCache().put(accessToken, username);
	}

	@Override
	public String getUsernameByAuthCode(String authCode) {
		return (String) getCache().get(authCode).get();
	}

	@Override
	public String getUsernameByAccessToken(String accessToken) {
		return (String) getCache().get(accessToken).get();
	}

	@Override
	public boolean checkAuthCode(String authCode) {
		return getCache().get(authCode) != null;
	}

	@Override
	public boolean checkAccessToken(String accessToken) {
		return getCache().get(accessToken) != null;
	}

	@Override
	public void addUserByAccessCode(String username, String accessToken) {
		// TODO Auto-generated method stub
		getCache().put(username, accessToken);

	}

	@Override
	public String getAccessCodeByUsername(String username) {
		// TODO Auto-generated method stub
		if (getCache().get(username) != null) {
			return (String) getCache().get(username).get();
		}
		// ValueWrapper value = getCache().get(username);
		return null;
	}

	@Override
	public void evictOldAccessToken(String accessToken) {
		// TODO Auto-generated method stub
		getCache().evict(accessToken);

	}

	@Override
	public boolean checkClientId(String clientId) {
		return clientService.findByAppKey(clientId) != null;
	}

	@Override
	public boolean checkClientSecret(String clientSecret) {
		return clientService.findByAppSecret(clientSecret) != null;
	}

	@Override
	public long getExpireIn() {
		return this.expireIn;
	}
}
