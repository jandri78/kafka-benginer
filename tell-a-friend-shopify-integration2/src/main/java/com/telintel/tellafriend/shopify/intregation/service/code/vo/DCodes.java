package com.telintel.tellafriend.shopify.intregation.service.code.vo;

import java.util.List;

public class DCodes {
	
	private List<ShopifyCodeVO> discount_codes;

	public List<ShopifyCodeVO> getDiscount_codes() {
		return discount_codes;
	}

	public void setDiscount_codes(List<ShopifyCodeVO> discount_codes) {
		this.discount_codes = discount_codes;
	}

	@Override
	public String toString() {
		return "DCodes [discount_codes=" + discount_codes + "]";
	}


	
	

}
