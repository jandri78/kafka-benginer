package com.telintel.tellafriend.shopify.intregation.service.priceRules.vo;

public class PrerequisiteToEntitlementQuantityRatio {
	private Object prerequisite_quantity;
	private Object entitled_quantity;

	public Object getPrerequisiteQuantity() {
		return prerequisite_quantity;
	}

	public void setPrerequisiteQuantity(Object value) {
		this.prerequisite_quantity = value;
	}

	public Object getEntitledQuantity() {
		return entitled_quantity;
	}

	public void setEntitledQuantity(Object value) {
		this.entitled_quantity = value;
	}
}
