package com.telintel.tellafriend.shopify.intregation.service.data;

import java.io.Serializable;
import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LineItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private long variantID;
	private String title;
	private long quantity;
	private String sku;
	private String variantTitle;
	private String vendor;
	private String fulfillmentService;
	private long productID;
	private boolean requiresShipping;
	private boolean taxable;
	private boolean giftCard;
	private String name;
	private String variantInventoryManagement;
	private Object[] properties;
	private boolean productExists;
	private long fulfillableQuantity;
	private long grams;
	private String price;
	private String totalDiscount;
	private Object fulfillmentStatus;
	private Set priceSet;
	private Set totalDiscountSet;
	private DiscountAllocation[] discountAllocations;
	private String adminGraphqlAPIID;
	private TaxLine[] taxLines;
	private OriginLocation originLocation;

	@JsonProperty("id")
	public long getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(long value) {
		this.id = value;
	}

	@JsonProperty("variant_id")
	public long getVariantID() {
		return variantID;
	}

	@JsonProperty("variant_id")
	public void setVariantID(long value) {
		this.variantID = value;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String value) {
		this.title = value;
	}

	@JsonProperty("quantity")
	public long getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(long value) {
		this.quantity = value;
	}

	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	@JsonProperty("sku")
	public void setSku(String value) {
		this.sku = value;
	}

	@JsonProperty("variant_title")
	public String getVariantTitle() {
		return variantTitle;
	}

	@JsonProperty("variant_title")
	public void setVariantTitle(String value) {
		this.variantTitle = value;
	}

	@JsonProperty("vendor")
	public String getVendor() {
		return vendor;
	}

	@JsonProperty("vendor")
	public void setVendor(String value) {
		this.vendor = value;
	}

	@JsonProperty("fulfillment_service")
	public String getFulfillmentService() {
		return fulfillmentService;
	}

	@JsonProperty("fulfillment_service")
	public void setFulfillmentService(String value) {
		this.fulfillmentService = value;
	}

	@JsonProperty("product_id")
	public long getProductID() {
		return productID;
	}

	@JsonProperty("product_id")
	public void setProductID(long value) {
		this.productID = value;
	}

	@JsonProperty("requires_shipping")
	public boolean getRequiresShipping() {
		return requiresShipping;
	}

	@JsonProperty("requires_shipping")
	public void setRequiresShipping(boolean value) {
		this.requiresShipping = value;
	}

	@JsonProperty("taxable")
	public boolean getTaxable() {
		return taxable;
	}

	@JsonProperty("taxable")
	public void setTaxable(boolean value) {
		this.taxable = value;
	}

	@JsonProperty("gift_card")
	public boolean getGiftCard() {
		return giftCard;
	}

	@JsonProperty("gift_card")
	public void setGiftCard(boolean value) {
		this.giftCard = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("variant_inventory_management")
	public String getVariantInventoryManagement() {
		return variantInventoryManagement;
	}

	@JsonProperty("variant_inventory_management")
	public void setVariantInventoryManagement(String value) {
		this.variantInventoryManagement = value;
	}

	@JsonProperty("properties")
	public Object[] getProperties() {
		return properties;
	}

	@JsonProperty("properties")
	public void setProperties(Object[] value) {
		this.properties = value;
	}

	@JsonProperty("product_exists")
	public boolean getProductExists() {
		return productExists;
	}

	@JsonProperty("product_exists")
	public void setProductExists(boolean value) {
		this.productExists = value;
	}

	@JsonProperty("fulfillable_quantity")
	public long getFulfillableQuantity() {
		return fulfillableQuantity;
	}

	@JsonProperty("fulfillable_quantity")
	public void setFulfillableQuantity(long value) {
		this.fulfillableQuantity = value;
	}

	@JsonProperty("grams")
	public long getGrams() {
		return grams;
	}

	@JsonProperty("grams")
	public void setGrams(long value) {
		this.grams = value;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String value) {
		this.price = value;
	}

	@JsonProperty("total_discount")
	public String getTotalDiscount() {
		return totalDiscount;
	}

	@JsonProperty("total_discount")
	public void setTotalDiscount(String value) {
		this.totalDiscount = value;
	}

	@JsonProperty("fulfillment_status")
	public Object getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	@JsonProperty("fulfillment_status")
	public void setFulfillmentStatus(Object value) {
		this.fulfillmentStatus = value;
	}

	@JsonProperty("price_set")
	public Set getPriceSet() {
		return priceSet;
	}

	@JsonProperty("price_set")
	public void setPriceSet(Set value) {
		this.priceSet = value;
	}

	@JsonProperty("total_discount_set")
	public Set getTotalDiscountSet() {
		return totalDiscountSet;
	}

	@JsonProperty("total_discount_set")
	public void setTotalDiscountSet(Set value) {
		this.totalDiscountSet = value;
	}

	@JsonProperty("discount_allocations")
	public DiscountAllocation[] getDiscountAllocations() {
		return discountAllocations;
	}

	@JsonProperty("discount_allocations")
	public void setDiscountAllocations(DiscountAllocation[] value) {
		this.discountAllocations = value;
	}

	@JsonProperty("admin_graphql_api_id")
	public String getAdminGraphqlAPIID() {
		return adminGraphqlAPIID;
	}

	@JsonProperty("admin_graphql_api_id")
	public void setAdminGraphqlAPIID(String value) {
		this.adminGraphqlAPIID = value;
	}

	@JsonProperty("tax_lines")
	public TaxLine[] getTaxLines() {
		return taxLines;
	}

	@JsonProperty("tax_lines")
	public void setTaxLines(TaxLine[] value) {
		this.taxLines = value;
	}

	@JsonProperty("origin_location")
	public OriginLocation getOriginLocation() {
		return originLocation;
	}

	@JsonProperty("origin_location")
	public void setOriginLocation(OriginLocation value) {
		this.originLocation = value;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "LineItem [id=" + id + ", variantID=" + variantID + ", " + (title != null ? "title=" + title + ", " : "")
				+ "quantity=" + quantity + ", " + (sku != null ? "sku=" + sku + ", " : "")
				+ (variantTitle != null ? "variantTitle=" + variantTitle + ", " : "")
				+ (vendor != null ? "vendor=" + vendor + ", " : "")
				+ (fulfillmentService != null ? "fulfillmentService=" + fulfillmentService + ", " : "") + "productID="
				+ productID + ", requiresShipping=" + requiresShipping + ", taxable=" + taxable + ", giftCard="
				+ giftCard + ", " + (name != null ? "name=" + name + ", " : "")
				+ (variantInventoryManagement != null
						? "variantInventoryManagement=" + variantInventoryManagement + ", "
						: "")
				+ (properties != null
						? "properties=" + Arrays.asList(properties).subList(0, Math.min(properties.length, maxLen))
								+ ", "
						: "")
				+ "productExists=" + productExists + ", fulfillableQuantity=" + fulfillableQuantity + ", grams=" + grams
				+ ", " + (price != null ? "price=" + price + ", " : "")
				+ (totalDiscount != null ? "totalDiscount=" + totalDiscount + ", " : "")
				+ (fulfillmentStatus != null ? "fulfillmentStatus=" + fulfillmentStatus + ", " : "")
				+ (priceSet != null ? "priceSet=" + priceSet + ", " : "")
				+ (totalDiscountSet != null ? "totalDiscountSet=" + totalDiscountSet + ", " : "")
				+ (discountAllocations != null ? "discountAllocations="
						+ Arrays.asList(discountAllocations).subList(0, Math.min(discountAllocations.length, maxLen))
						+ ", " : "")
				+ (adminGraphqlAPIID != null ? "adminGraphqlAPIID=" + adminGraphqlAPIID + ", " : "")
				+ (taxLines != null
						? "taxLines=" + Arrays.asList(taxLines).subList(0, Math.min(taxLines.length, maxLen)) + ", "
						: "")
				+ (originLocation != null ? "originLocation=" + originLocation : "") + "]";
	}

}
