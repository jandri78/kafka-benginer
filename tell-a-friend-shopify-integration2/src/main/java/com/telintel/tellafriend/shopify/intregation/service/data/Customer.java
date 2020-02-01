package com.telintel.tellafriend.shopify.intregation.service.data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer implements Serializable {

	private long id;
	private String email;
	private boolean acceptsMarketing;
	private String createdAt;
	private String updatedAt;
	private String firstName;
	private String lastName;
	private long ordersCount;
	private String state;
	private String totalSpent;
	private long lastOrderID;
	private Object note;
	private boolean verifiedEmail;
	private Object multipassIdentifier;
	private boolean taxExempt;
	private String phone;
	private String tags;
	private String lastOrderName;
	private Currency currency;
	private String acceptsMarketingUpdatedAt;
	private String marketingOptInLevel;
	private String adminGraphqlAPIID;
	private Address defaultAddress;

	@JsonProperty("id")
	public long getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(long value) {
		this.id = value;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String value) {
		this.email = value;
	}

	@JsonProperty("accepts_marketing")
	public boolean getAcceptsMarketing() {
		return acceptsMarketing;
	}

	@JsonProperty("accepts_marketing")
	public void setAcceptsMarketing(boolean value) {
		this.acceptsMarketing = value;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String value) {
		this.createdAt = value;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String value) {
		this.updatedAt = value;
	}

	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("first_name")
	public void setFirstName(String value) {
		this.firstName = value;
	}

	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("last_name")
	public void setLastName(String value) {
		this.lastName = value;
	}

	@JsonProperty("orders_count")
	public long getOrdersCount() {
		return ordersCount;
	}

	@JsonProperty("orders_count")
	public void setOrdersCount(long value) {
		this.ordersCount = value;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String value) {
		this.state = value;
	}

	@JsonProperty("total_spent")
	public String getTotalSpent() {
		return totalSpent;
	}

	@JsonProperty("total_spent")
	public void setTotalSpent(String value) {
		this.totalSpent = value;
	}

	@JsonProperty("last_order_id")
	public long getLastOrderID() {
		return lastOrderID;
	}

	@JsonProperty("last_order_id")
	public void setLastOrderID(long value) {
		this.lastOrderID = value;
	}

	@JsonProperty("note")
	public Object getNote() {
		return note;
	}

	@JsonProperty("note")
	public void setNote(Object value) {
		this.note = value;
	}

	@JsonProperty("verified_email")
	public boolean getVerifiedEmail() {
		return verifiedEmail;
	}

	@JsonProperty("verified_email")
	public void setVerifiedEmail(boolean value) {
		this.verifiedEmail = value;
	}

	@JsonProperty("multipass_identifier")
	public Object getMultipassIdentifier() {
		return multipassIdentifier;
	}

	@JsonProperty("multipass_identifier")
	public void setMultipassIdentifier(Object value) {
		this.multipassIdentifier = value;
	}

	@JsonProperty("tax_exempt")
	public boolean getTaxExempt() {
		return taxExempt;
	}

	@JsonProperty("tax_exempt")
	public void setTaxExempt(boolean value) {
		this.taxExempt = value;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String value) {
		this.phone = value;
	}

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String value) {
		this.tags = value;
	}

	@JsonProperty("last_order_name")
	public String getLastOrderName() {
		return lastOrderName;
	}

	@JsonProperty("last_order_name")
	public void setLastOrderName(String value) {
		this.lastOrderName = value;
	}

	@JsonProperty("currency")
	public Currency getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(Currency value) {
		this.currency = value;
	}

	@JsonProperty("accepts_marketing_updated_at")
	public String getAcceptsMarketingUpdatedAt() {
		return acceptsMarketingUpdatedAt;
	}

	@JsonProperty("accepts_marketing_updated_at")
	public void setAcceptsMarketingUpdatedAt(String value) {
		this.acceptsMarketingUpdatedAt = value;
	}

	@JsonProperty("marketing_opt_in_level")
	public String getMarketingOptInLevel() {
		return marketingOptInLevel;
	}

	@JsonProperty("marketing_opt_in_level")
	public void setMarketingOptInLevel(String value) {
		this.marketingOptInLevel = value;
	}

	@JsonProperty("admin_graphql_api_id")
	public String getAdminGraphqlAPIID() {
		return adminGraphqlAPIID;
	}

	@JsonProperty("admin_graphql_api_id")
	public void setAdminGraphqlAPIID(String value) {
		this.adminGraphqlAPIID = value;
	}

	@JsonProperty("default_address")
	public Address getDefaultAddress() {
		return defaultAddress;
	}

	@JsonProperty("default_address")
	public void setDefaultAddress(Address value) {
		this.defaultAddress = value;
	}
}
