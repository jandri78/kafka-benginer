package com.telintel.tellafriend.shopify.intregation.service.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;

public class DiscountCode implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	private Double amount;
	private String type;

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String value) {
		this.code = value;
	}

	@JsonProperty("amount")
	public Double getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(Double value) {
		this.amount = value;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String value) {
		this.type = value;
	}

	@Override
	public String toString() {
		return "DiscountCode [" + (code != null ? "code=" + code + ", " : "")
				+ (amount != null ? "amount=" + amount + ", " : "") + (type != null ? "type=" + type : "") + "]";
	}

}
