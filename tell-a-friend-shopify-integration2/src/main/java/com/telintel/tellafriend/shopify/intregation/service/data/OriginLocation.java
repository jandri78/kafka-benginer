package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class OriginLocation {
    private long id;
    private String countryCode;
    private String provinceCode;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("country_code")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("country_code")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("province_code")
    public String getProvinceCode() { return provinceCode; }
    @JsonProperty("province_code")
    public void setProvinceCode(String value) { this.provinceCode = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("address1")
    public String getAddress1() { return address1; }
    @JsonProperty("address1")
    public void setAddress1(String value) { this.address1 = value; }

    @JsonProperty("address2")
    public String getAddress2() { return address2; }
    @JsonProperty("address2")
    public void setAddress2(String value) { this.address2 = value; }

    @JsonProperty("city")
    public String getCity() { return city; }
    @JsonProperty("city")
    public void setCity(String value) { this.city = value; }

    @JsonProperty("zip")
    public String getZip() { return zip; }
    @JsonProperty("zip")
    public void setZip(String value) { this.zip = value; }
}
