package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DiscountAllocation {
    private String amount;
    private long discountApplicationIndex;
    private Set amountSet;

    @JsonProperty("amount")
    public String getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(String value) { this.amount = value; }

    @JsonProperty("discount_application_index")
    public long getDiscountApplicationIndex() { return discountApplicationIndex; }
    @JsonProperty("discount_application_index")
    public void setDiscountApplicationIndex(long value) { this.discountApplicationIndex = value; }

    @JsonProperty("amount_set")
    public Set getAmountSet() { return amountSet; }
    @JsonProperty("amount_set")
    public void setAmountSet(Set value) { this.amountSet = value; }
}
