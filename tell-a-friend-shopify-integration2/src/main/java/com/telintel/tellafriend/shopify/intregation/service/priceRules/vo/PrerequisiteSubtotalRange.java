package com.telintel.tellafriend.shopify.intregation.service.priceRules.vo;

public class PrerequisiteSubtotalRange {
	private double greater_than_or_equal_to;

	private double less_than_or_equal_to;

	public double getGreater_than_or_equal_to() {
		return greater_than_or_equal_to;
	}

	public void setGreater_than_or_equal_to(double greater_than_or_equal_to) {
		this.greater_than_or_equal_to = greater_than_or_equal_to;
	}

	public double getLess_than_or_equal_to() {
		return less_than_or_equal_to;
	}

	public void setLess_than_or_equal_to(double less_than_or_equal_to) {
		this.less_than_or_equal_to = less_than_or_equal_to;
	}
}
