package com.telintel.tellafriend.shopify.intregation.service.app;

import com.fasterxml.jackson.annotation.*;

public class Shop {

	private ShopClass shop;

	@JsonProperty("shop")
	public ShopClass getShop() {
		return shop;
	}

	@JsonProperty("shop")
	public void setShop(ShopClass value) {
		this.shop = value;
	}

}
