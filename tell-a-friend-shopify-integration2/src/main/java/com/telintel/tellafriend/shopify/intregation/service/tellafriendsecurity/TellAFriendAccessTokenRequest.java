package com.telintel.tellafriend.shopify.intregation.service.tellafriendsecurity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TellAFriendAccessTokenRequest {

	public TellAFriendAccessTokenRequest() {
	}

	public TellAFriendAccessTokenRequest(String apikey, String apisecret, String grantType) {
		super();
		this.apikey = apikey;
		this.apisecret = apisecret;
		this.grantType = grantType;
	}

	private String apikey;

	private String apisecret;

	@JsonProperty("grant_type")
	private String grantType;

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getApisecret() {
		return apisecret;
	}

	public void setApisecret(String apisecret) {
		this.apisecret = apisecret;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

}
