package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Money {
    private String amount;
    private Currency currencyCode;

    @JsonProperty("amount")
    public String getAmount() { return amount; }
    @JsonProperty("amount")
    public void setAmount(String value) { this.amount = value; }

    @JsonProperty("currency_code")
    public Currency getCurrencyCode() { return currencyCode; }
    @JsonProperty("currency_code")
    public void setCurrencyCode(Currency value) { this.currencyCode = value; }
}
