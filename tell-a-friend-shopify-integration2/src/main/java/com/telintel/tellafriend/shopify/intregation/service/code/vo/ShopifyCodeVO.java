package com.telintel.tellafriend.shopify.intregation.service.code.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyCodeVO {

	private String id;
	private String code;
	private Date created_at;
	private Date updated_at;
	private String price_rule_id;
	private int usage_count;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getPrice_rule_id() {
		return price_rule_id;
	}

	public void setPrice_rule_id(String price_rule_id) {
		this.price_rule_id = price_rule_id;
	}

	public int getUsage_count() {
		return usage_count;
	}

	public void setUsage_count(int usage_count) {
		this.usage_count = usage_count;
	}

	@Override
	public String toString() {
		return "ShopifyCodeDTO [id=" + id + ", code=" + code + ", created_at=" + created_at + ", updated_at="
				+ updated_at + ", price_rule_id=" + price_rule_id + ", usage_count=" + usage_count + "]";
	}

}
