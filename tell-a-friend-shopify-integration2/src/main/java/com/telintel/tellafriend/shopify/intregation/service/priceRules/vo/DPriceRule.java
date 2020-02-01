package com.telintel.tellafriend.shopify.intregation.service.priceRules.vo;

public class DPriceRule {

	private PriceRule price_rule;

	public PriceRule getPrice_rule() {
		return price_rule;
	}

	public void setPrice_rule(PriceRule price_rule) {
		this.price_rule = price_rule;
	}

	@Override
	public String toString() {
		return "DPriceRule [price_rule=" + price_rule + "]";
	}
	
	
}
