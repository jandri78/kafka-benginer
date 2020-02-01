package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Currency {
    COP;

    @JsonValue
    public String toValue() {
        switch (this) {
        case COP: return "COP";
        }
        return null;
    }

    @JsonCreator
    public static Currency forValue(String value) throws IOException {
        if (value.equals("COP")) return COP;
        throw new IOException("Cannot deserialize Currency");
    }
}
