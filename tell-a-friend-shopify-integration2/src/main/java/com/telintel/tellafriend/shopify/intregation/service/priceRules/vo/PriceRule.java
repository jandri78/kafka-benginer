package com.telintel.tellafriend.shopify.intregation.service.priceRules.vo;

import java.util.Date;
import java.util.List;

public class PriceRule {

	private long id;
	private String value_type;
	private double value;
	private String customer_selection;
	private String target_type;
	private String target_selection;
	private String allocation_method;
	private int allocation_limit;
	private boolean once_per_customer;
	private int usage_limit;
	private String starts_at;
	private Date ends_at;
	private Date created_at;
	private Date updated_at;
	private List<Object> entitled_product_ids;
	private List<Object> entitled_variant_ids;
	private List<Object> entitled_collection_ids;
	private List<Object> entitled_country_ids;
	private List<Object> prerequisite_product_ids;
	private List<Object> prerequisite_variant_ids;
	private List<Object> prerequisite_collection_ids;
	private List<Object> prerequisite_saved_search_ids;
	private List<Object> prerequisite_customer_ids;
	private PrerequisiteSubtotalRange prerequisite_subtotal_range;
	private Object prerequisite_quantity_range;
	private Object prerequisite_shipping_price_range;
	private PrerequisiteToEntitlementQuantityRatio prerequisite_to_entitlement_quantity_ratio;
	private String title;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValue_type() {
		return value_type;
	}

	public void setValue_type(String value_type) {
		this.value_type = value_type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCustomer_selection() {
		return customer_selection;
	}

	public void setCustomer_selection(String customer_selection) {
		this.customer_selection = customer_selection;
	}

	public String getTarget_type() {
		return target_type;
	}

	public void setTarget_type(String target_type) {
		this.target_type = target_type;
	}

	public String getTarget_selection() {
		return target_selection;
	}

	public void setTarget_selection(String target_selection) {
		this.target_selection = target_selection;
	}

	public String getAllocation_method() {
		return allocation_method;
	}

	public void setAllocation_method(String allocation_method) {
		this.allocation_method = allocation_method;
	}

	public int getAllocation_limit() {
		return allocation_limit;
	}

	public void setAllocation_limit(int allocation_limit) {
		this.allocation_limit = allocation_limit;
	}

	public boolean isOnce_per_customer() {
		return once_per_customer;
	}

	public void setOnce_per_customer(boolean once_per_customer) {
		this.once_per_customer = once_per_customer;
	}

	public int getUsage_limit() {
		return usage_limit;
	}

	public void setUsage_limit(int usage_limit) {
		this.usage_limit = usage_limit;
	}

	public String getStarts_at() {
		return starts_at;
	}

	public void setStarts_at(String starts_at) {
		this.starts_at = starts_at;
	}

	public Date getEnds_at() {
		return ends_at;
	}

	public void setEnds_at(Date ends_at) {
		this.ends_at = ends_at;
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

	public List<Object> getEntitled_product_ids() {
		return entitled_product_ids;
	}

	public void setEntitled_product_ids(List<Object> entitled_product_ids) {
		this.entitled_product_ids = entitled_product_ids;
	}

	public List<Object> getEntitled_variant_ids() {
		return entitled_variant_ids;
	}

	public void setEntitled_variant_ids(List<Object> entitled_variant_ids) {
		this.entitled_variant_ids = entitled_variant_ids;
	}

	public List<Object> getEntitled_collection_ids() {
		return entitled_collection_ids;
	}

	public void setEntitled_collection_ids(List<Object> entitled_collection_ids) {
		this.entitled_collection_ids = entitled_collection_ids;
	}

	public List<Object> getEntitled_country_ids() {
		return entitled_country_ids;
	}

	public void setEntitled_country_ids(List<Object> entitled_country_ids) {
		this.entitled_country_ids = entitled_country_ids;
	}

	public List<Object> getPrerequisite_product_ids() {
		return prerequisite_product_ids;
	}

	public void setPrerequisite_product_ids(List<Object> prerequisite_product_ids) {
		this.prerequisite_product_ids = prerequisite_product_ids;
	}

	public List<Object> getPrerequisite_variant_ids() {
		return prerequisite_variant_ids;
	}

	public void setPrerequisite_variant_ids(List<Object> prerequisite_variant_ids) {
		this.prerequisite_variant_ids = prerequisite_variant_ids;
	}

	public List<Object> getPrerequisite_collection_ids() {
		return prerequisite_collection_ids;
	}

	public void setPrerequisite_collection_ids(List<Object> prerequisite_collection_ids) {
		this.prerequisite_collection_ids = prerequisite_collection_ids;
	}

	public List<Object> getPrerequisite_saved_search_ids() {
		return prerequisite_saved_search_ids;
	}

	public void setPrerequisite_saved_search_ids(List<Object> prerequisite_saved_search_ids) {
		this.prerequisite_saved_search_ids = prerequisite_saved_search_ids;
	}

	public List<Object> getPrerequisite_customer_ids() {
		return prerequisite_customer_ids;
	}

	public void setPrerequisite_customer_ids(List<Object> prerequisite_customer_ids) {
		this.prerequisite_customer_ids = prerequisite_customer_ids;
	}

	public PrerequisiteSubtotalRange getPrerequisite_subtotal_range() {
		return prerequisite_subtotal_range;
	}

	public void setPrerequisite_subtotal_range(PrerequisiteSubtotalRange prerequisite_subtotal_range) {
		this.prerequisite_subtotal_range = prerequisite_subtotal_range;
	}

	public Object getPrerequisite_quantity_range() {
		return prerequisite_quantity_range;
	}

	public void setPrerequisite_quantity_range(Object prerequisite_quantity_range) {
		this.prerequisite_quantity_range = prerequisite_quantity_range;
	}

	public Object getPrerequisite_shipping_price_range() {
		return prerequisite_shipping_price_range;
	}

	public void setPrerequisite_shipping_price_range(Object prerequisite_shipping_price_range) {
		this.prerequisite_shipping_price_range = prerequisite_shipping_price_range;
	}

	public PrerequisiteToEntitlementQuantityRatio getPrerequisite_to_entitlement_quantity_ratio() {
		return prerequisite_to_entitlement_quantity_ratio;
	}

	public void setPrerequisite_to_entitlement_quantity_ratio(
			PrerequisiteToEntitlementQuantityRatio prerequisite_to_entitlement_quantity_ratio) {
		this.prerequisite_to_entitlement_quantity_ratio = prerequisite_to_entitlement_quantity_ratio;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "PriceRule [id=" + id + ", value_type=" + value_type + ", value=" + value + ", customer_selection="
				+ customer_selection + ", target_type=" + target_type + ", target_selection=" + target_selection
				+ ", allocation_method=" + allocation_method + ", allocation_limit=" + allocation_limit
				+ ", once_per_customer=" + once_per_customer + ", usage_limit=" + usage_limit + ", starts_at="
				+ starts_at + ", ends_at=" + ends_at + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", entitled_product_ids=" + entitled_product_ids + ", entitled_variant_ids=" + entitled_variant_ids
				+ ", entitled_collection_ids=" + entitled_collection_ids + ", entitled_country_ids="
				+ entitled_country_ids + ", prerequisite_product_ids=" + prerequisite_product_ids
				+ ", prerequisite_variant_ids=" + prerequisite_variant_ids + ", prerequisite_collection_ids="
				+ prerequisite_collection_ids + ", prerequisite_saved_search_ids=" + prerequisite_saved_search_ids
				+ ", prerequisite_customer_ids=" + prerequisite_customer_ids + ", prerequisite_subtotal_range="
				+ prerequisite_subtotal_range + ", prerequisite_quantity_range=" + prerequisite_quantity_range
				+ ", prerequisite_shipping_price_range=" + prerequisite_shipping_price_range
				+ ", prerequisite_to_entitlement_quantity_ratio=" + prerequisite_to_entitlement_quantity_ratio
				+ ", title=" + title + "]";
	}

}
