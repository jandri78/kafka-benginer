package com.telintel.tellafriend.shopify.intregation.service.repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MerchantEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String merchantUrl;

	private String shopifyAccessToken;

	private String tafMerchantId;

	private String tafApiKey;

	private String tafApiSecret;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMerchantUrl() {
		return merchantUrl;
	}

	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}

	public String getShopifyAccessToken() {
		return shopifyAccessToken;
	}

	public void setShopifyAccessToken(String shopifyAccessToken) {
		this.shopifyAccessToken = shopifyAccessToken;
	}

	public String getTafMerchantId() {
		return tafMerchantId;
	}

	public void setTafMerchantId(String tafMerchantId) {
		this.tafMerchantId = tafMerchantId;
	}

	public String getTafApiKey() {
		return tafApiKey;
	}

	public void setTafApiKey(String tafApiKey) {
		this.tafApiKey = tafApiKey;
	}

	public String getTafApiSecret() {
		return tafApiSecret;
	}

	public void setTafApiSecret(String tafApiSecret) {
		this.tafApiSecret = tafApiSecret;
	}

	@Override
	public String toString() {
		return "MerchantEntity [id=" + id + ", merchantUrl=" + merchantUrl + ", shopifyAccessToken="
				+ shopifyAccessToken + ", tafMerchantId=" + tafMerchantId + ", tafApiKey=" + tafApiKey
				+ ", tafApiSecret=" + tafApiSecret + "]";
	}

}
