package com.telintel.tellafriend.shopify.intregation.service.app;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.*;

public class SignUpResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String apiKey;
	private String apiSecret;
	private String merchantID;

	@JsonProperty("apiKey")
	public String getAPIKey() {
		return apiKey;
	}

	@JsonProperty("apiKey")
	public void setAPIKey(String value) {
		this.apiKey = value;
	}

	@JsonProperty("apiSecret")
	public String getAPISecret() {
		return apiSecret;
	}

	@JsonProperty("apiSecret")
	public void setAPISecret(String value) {
		this.apiSecret = value;
	}

	@JsonProperty("merchantId")
	public String getMerchantID() {
		return merchantID;
	}

	@JsonProperty("merchantId")
	public void setMerchantID(String value) {
		this.merchantID = value;
	}
}