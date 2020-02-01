package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ShippingLine {
    private long id;
    private String title;
    private String price;
    private String code;
    private String source;
    private Object phone;
    private Object requestedFulfillmentServiceID;
    private Object deliveryCategory;
    private Object carrierIdentifier;
    private String discountedPrice;
    private Set priceSet;
    private Set discountedPriceSet;
    private Object[] discountAllocations;
    private Object[] taxLines;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("price")
    public String getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(String value) { this.price = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("phone")
    public Object getPhone() { return phone; }
    @JsonProperty("phone")
    public void setPhone(Object value) { this.phone = value; }

    @JsonProperty("requested_fulfillment_service_id")
    public Object getRequestedFulfillmentServiceID() { return requestedFulfillmentServiceID; }
    @JsonProperty("requested_fulfillment_service_id")
    public void setRequestedFulfillmentServiceID(Object value) { this.requestedFulfillmentServiceID = value; }

    @JsonProperty("delivery_category")
    public Object getDeliveryCategory() { return deliveryCategory; }
    @JsonProperty("delivery_category")
    public void setDeliveryCategory(Object value) { this.deliveryCategory = value; }

    @JsonProperty("carrier_identifier")
    public Object getCarrierIdentifier() { return carrierIdentifier; }
    @JsonProperty("carrier_identifier")
    public void setCarrierIdentifier(Object value) { this.carrierIdentifier = value; }

    @JsonProperty("discounted_price")
    public String getDiscountedPrice() { return discountedPrice; }
    @JsonProperty("discounted_price")
    public void setDiscountedPrice(String value) { this.discountedPrice = value; }

    @JsonProperty("price_set")
    public Set getPriceSet() { return priceSet; }
    @JsonProperty("price_set")
    public void setPriceSet(Set value) { this.priceSet = value; }

    @JsonProperty("discounted_price_set")
    public Set getDiscountedPriceSet() { return discountedPriceSet; }
    @JsonProperty("discounted_price_set")
    public void setDiscountedPriceSet(Set value) { this.discountedPriceSet = value; }

    @JsonProperty("discount_allocations")
    public Object[] getDiscountAllocations() { return discountAllocations; }
    @JsonProperty("discount_allocations")
    public void setDiscountAllocations(Object[] value) { this.discountAllocations = value; }

    @JsonProperty("tax_lines")
    public Object[] getTaxLines() { return taxLines; }
    @JsonProperty("tax_lines")
    public void setTaxLines(Object[] value) { this.taxLines = value; }
}
