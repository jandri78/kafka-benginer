package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Set {
    private Money shopMoney;
    private Money presentmentMoney;

    @JsonProperty("shop_money")
    public Money getShopMoney() { return shopMoney; }
    @JsonProperty("shop_money")
    public void setShopMoney(Money value) { this.shopMoney = value; }

    @JsonProperty("presentment_money")
    public Money getPresentmentMoney() { return presentmentMoney; }
    @JsonProperty("presentment_money")
    public void setPresentmentMoney(Money value) { this.presentmentMoney = value; }
}
