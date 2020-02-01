package com.telintel.tellafriend.shopify.intregation.service.code.vo;

public class DCode {

	private ShopifyCodeVO discount_code;

	public ShopifyCodeVO getDiscount_code() {
		return discount_code;
	}

	public void setDiscount_code(ShopifyCodeVO discount_code) {
		this.discount_code = discount_code;
	}

	@Override
	public String toString() {
		return "DCode [discount_code=" + discount_code + "]";
	}

}
