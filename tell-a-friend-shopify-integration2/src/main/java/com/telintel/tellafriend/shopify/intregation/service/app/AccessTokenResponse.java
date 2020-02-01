package com.telintel.tellafriend.shopify.intregation.service.app;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("access_token")
	private String accessToken;

	private String scope;

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "AccessTokenResponse [accessToken=" + accessToken + ", scope=" + scope + "]";
	}

}
