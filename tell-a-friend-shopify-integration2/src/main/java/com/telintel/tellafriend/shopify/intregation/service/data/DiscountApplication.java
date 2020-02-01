package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DiscountApplication {
    private String type;
    private String value;
    private String valueType;
    private String allocationMethod;
    private String targetSelection;
    private String targetType;
    private String code;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }

    @JsonProperty("value_type")
    public String getValueType() { return valueType; }
    @JsonProperty("value_type")
    public void setValueType(String value) { this.valueType = value; }

    @JsonProperty("allocation_method")
    public String getAllocationMethod() { return allocationMethod; }
    @JsonProperty("allocation_method")
    public void setAllocationMethod(String value) { this.allocationMethod = value; }

    @JsonProperty("target_selection")
    public String getTargetSelection() { return targetSelection; }
    @JsonProperty("target_selection")
    public void setTargetSelection(String value) { this.targetSelection = value; }

    @JsonProperty("target_type")
    public String getTargetType() { return targetType; }
    @JsonProperty("target_type")
    public void setTargetType(String value) { this.targetType = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }
}
