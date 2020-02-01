package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class TaxLine {
    private String title;
    private String price;
    private double rate;
    private Set priceSet;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("price")
    public String getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(String value) { this.price = value; }

    @JsonProperty("rate")
    public double getRate() { return rate; }
    @JsonProperty("rate")
    public void setRate(double value) { this.rate = value; }

    @JsonProperty("price_set")
    public Set getPriceSet() { return priceSet; }
    @JsonProperty("price_set")
    public void setPriceSet(Set value) { this.priceSet = value; }
}
