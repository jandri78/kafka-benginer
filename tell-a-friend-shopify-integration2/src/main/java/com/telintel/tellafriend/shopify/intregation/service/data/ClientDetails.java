package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ClientDetails {
    private String browserIP;
    private String acceptLanguage;
    private String userAgent;
    private Object sessionHash;
    private long browserWidth;
    private long browserHeight;

    @JsonProperty("browser_ip")
    public String getBrowserIP() { return browserIP; }
    @JsonProperty("browser_ip")
    public void setBrowserIP(String value) { this.browserIP = value; }

    @JsonProperty("accept_language")
    public String getAcceptLanguage() { return acceptLanguage; }
    @JsonProperty("accept_language")
    public void setAcceptLanguage(String value) { this.acceptLanguage = value; }

    @JsonProperty("user_agent")
    public String getUserAgent() { return userAgent; }
    @JsonProperty("user_agent")
    public void setUserAgent(String value) { this.userAgent = value; }

    @JsonProperty("session_hash")
    public Object getSessionHash() { return sessionHash; }
    @JsonProperty("session_hash")
    public void setSessionHash(Object value) { this.sessionHash = value; }

    @JsonProperty("browser_width")
    public long getBrowserWidth() { return browserWidth; }
    @JsonProperty("browser_width")
    public void setBrowserWidth(long value) { this.browserWidth = value; }

    @JsonProperty("browser_height")
    public long getBrowserHeight() { return browserHeight; }
    @JsonProperty("browser_height")
    public void setBrowserHeight(long value) { this.browserHeight = value; }
}
