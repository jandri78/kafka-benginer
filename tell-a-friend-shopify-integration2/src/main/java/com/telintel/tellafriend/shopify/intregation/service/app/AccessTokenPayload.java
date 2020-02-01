package com.telintel.tellafriend.shopify.intregation.service.app;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenPayload implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("client_id")
	private String clientId;

	@JsonProperty("client_secret")
	private String clientSecret;

	@JsonProperty("code")
	private String code;

	public AccessTokenPayload() {
		super();
	}

	public AccessTokenPayload(String clientId, String clientSecret, String code) {
		super();
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.code = code;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "AccessTokenPayload [clientId=" + clientId + ", clientSecret=" + clientSecret + ", code=" + code + "]";
	}

}
