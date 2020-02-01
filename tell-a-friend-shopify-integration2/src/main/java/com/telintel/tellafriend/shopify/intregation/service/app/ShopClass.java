package com.telintel.tellafriend.shopify.intregation.service.app;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopClass {

	private long id;
	private String name;
	private String email;
	private String domain;
	private String province;
	private String country;
	private String address1;
	private String zip;
	private String city;
	private Object source;
	private String phone;
	private double latitude;
	private double longitude;
	private String primaryLocale;
	private Object address2;
	private String createdAt;
	private String updatedAt;
	private String countryCode;
	private String countryName;
	private String currency;
	private String customerEmail;
	private String timezone;
	private String ianaTimezone;
	private String shopOwner;
	private String moneyFormat;
	private String moneyWithCurrencyFormat;
	private String weightUnit;
	private String provinceCode;
	private boolean taxesIncluded;
	private Object taxShipping;
	private boolean countyTaxes;
	private String planDisplayName;
	private String planName;
	private boolean hasDiscounts;
	private boolean hasGiftCards;
	private String myshopifyDomain;
	private Object googleAppsDomain;
	private Object googleAppsLoginEnabled;
	private String moneyInEmailsFormat;
	private String moneyWithCurrencyInEmailsFormat;
	private boolean eligibleForPayments;
	private boolean requiresExtraPaymentsAgreement;
	private boolean passwordEnabled;
	private boolean hasStorefront;
	private boolean eligibleForCardReaderGiveaway;
	private boolean finances;
	private long primaryLocationID;
	private boolean forceSSL;
	private boolean checkoutAPISupported;
	private boolean multiLocationEnabled;
	private boolean setupRequired;
	private boolean preLaunchEnabled;
	private List<String> enabledPresentmentCurrencies;

	@JsonProperty("id")
	public long getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(long value) {
		this.id = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String value) {
		this.email = value;
	}

	@JsonProperty("domain")
	public String getDomain() {
		return domain;
	}

	@JsonProperty("domain")
	public void setDomain(String value) {
		this.domain = value;
	}

	@JsonProperty("province")
	public String getProvince() {
		return province;
	}

	@JsonProperty("province")
	public void setProvince(String value) {
		this.province = value;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String value) {
		this.country = value;
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return address1;
	}

	@JsonProperty("address1")
	public void setAddress1(String value) {
		this.address1 = value;
	}

	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(String value) {
		this.zip = value;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String value) {
		this.city = value;
	}

	@JsonProperty("source")
	public Object getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(Object value) {
		this.source = value;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String value) {
		this.phone = value;
	}

	@JsonProperty("latitude")
	public double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(double value) {
		this.latitude = value;
	}

	@JsonProperty("longitude")
	public double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(double value) {
		this.longitude = value;
	}

	@JsonProperty("primary_locale")
	public String getPrimaryLocale() {
		return primaryLocale;
	}

	@JsonProperty("primary_locale")
	public void setPrimaryLocale(String value) {
		this.primaryLocale = value;
	}

	@JsonProperty("address2")
	public Object getAddress2() {
		return address2;
	}

	@JsonProperty("address2")
	public void setAddress2(Object value) {
		this.address2 = value;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String value) {
		this.createdAt = value;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String value) {
		this.updatedAt = value;
	}

	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("country_code")
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	@JsonProperty("country_name")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("country_name")
	public void setCountryName(String value) {
		this.countryName = value;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String value) {
		this.currency = value;
	}

	@JsonProperty("customer_email")
	public String getCustomerEmail() {
		return customerEmail;
	}

	@JsonProperty("customer_email")
	public void setCustomerEmail(String value) {
		this.customerEmail = value;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String value) {
		this.timezone = value;
	}

	@JsonProperty("iana_timezone")
	public String getIANATimezone() {
		return ianaTimezone;
	}

	@JsonProperty("iana_timezone")
	public void setIANATimezone(String value) {
		this.ianaTimezone = value;
	}

	@JsonProperty("shop_owner")
	public String getShopOwner() {
		return shopOwner;
	}

	@JsonProperty("shop_owner")
	public void setShopOwner(String value) {
		this.shopOwner = value;
	}

	@JsonProperty("money_format")
	public String getMoneyFormat() {
		return moneyFormat;
	}

	@JsonProperty("money_format")
	public void setMoneyFormat(String value) {
		this.moneyFormat = value;
	}

	@JsonProperty("money_with_currency_format")
	public String getMoneyWithCurrencyFormat() {
		return moneyWithCurrencyFormat;
	}

	@JsonProperty("money_with_currency_format")
	public void setMoneyWithCurrencyFormat(String value) {
		this.moneyWithCurrencyFormat = value;
	}

	@JsonProperty("weight_unit")
	public String getWeightUnit() {
		return weightUnit;
	}

	@JsonProperty("weight_unit")
	public void setWeightUnit(String value) {
		this.weightUnit = value;
	}

	@JsonProperty("province_code")
	public String getProvinceCode() {
		return provinceCode;
	}

	@JsonProperty("province_code")
	public void setProvinceCode(String value) {
		this.provinceCode = value;
	}

	@JsonProperty("taxes_included")
	public boolean getTaxesIncluded() {
		return taxesIncluded;
	}

	@JsonProperty("taxes_included")
	public void setTaxesIncluded(boolean value) {
		this.taxesIncluded = value;
	}

	@JsonProperty("tax_shipping")
	public Object getTaxShipping() {
		return taxShipping;
	}

	@JsonProperty("tax_shipping")
	public void setTaxShipping(Object value) {
		this.taxShipping = value;
	}

	@JsonProperty("county_taxes")
	public boolean getCountyTaxes() {
		return countyTaxes;
	}

	@JsonProperty("county_taxes")
	public void setCountyTaxes(boolean value) {
		this.countyTaxes = value;
	}

	@JsonProperty("plan_display_name")
	public String getPlanDisplayName() {
		return planDisplayName;
	}

	@JsonProperty("plan_display_name")
	public void setPlanDisplayName(String value) {
		this.planDisplayName = value;
	}

	@JsonProperty("plan_name")
	public String getPlanName() {
		return planName;
	}

	@JsonProperty("plan_name")
	public void setPlanName(String value) {
		this.planName = value;
	}

	@JsonProperty("has_discounts")
	public boolean getHasDiscounts() {
		return hasDiscounts;
	}

	@JsonProperty("has_discounts")
	public void setHasDiscounts(boolean value) {
		this.hasDiscounts = value;
	}

	@JsonProperty("has_gift_cards")
	public boolean getHasGiftCards() {
		return hasGiftCards;
	}

	@JsonProperty("has_gift_cards")
	public void setHasGiftCards(boolean value) {
		this.hasGiftCards = value;
	}

	@JsonProperty("myshopify_domain")
	public String getMyshopifyDomain() {
		return myshopifyDomain;
	}

	@JsonProperty("myshopify_domain")
	public void setMyshopifyDomain(String value) {
		this.myshopifyDomain = value;
	}

	@JsonProperty("google_apps_domain")
	public Object getGoogleAppsDomain() {
		return googleAppsDomain;
	}

	@JsonProperty("google_apps_domain")
	public void setGoogleAppsDomain(Object value) {
		this.googleAppsDomain = value;
	}

	@JsonProperty("google_apps_login_enabled")
	public Object getGoogleAppsLoginEnabled() {
		return googleAppsLoginEnabled;
	}

	@JsonProperty("google_apps_login_enabled")
	public void setGoogleAppsLoginEnabled(Object value) {
		this.googleAppsLoginEnabled = value;
	}

	@JsonProperty("money_in_emails_format")
	public String getMoneyInEmailsFormat() {
		return moneyInEmailsFormat;
	}

	@JsonProperty("money_in_emails_format")
	public void setMoneyInEmailsFormat(String value) {
		this.moneyInEmailsFormat = value;
	}

	@JsonProperty("money_with_currency_in_emails_format")
	public String getMoneyWithCurrencyInEmailsFormat() {
		return moneyWithCurrencyInEmailsFormat;
	}

	@JsonProperty("money_with_currency_in_emails_format")
	public void setMoneyWithCurrencyInEmailsFormat(String value) {
		this.moneyWithCurrencyInEmailsFormat = value;
	}

	@JsonProperty("eligible_for_payments")
	public boolean getEligibleForPayments() {
		return eligibleForPayments;
	}

	@JsonProperty("eligible_for_payments")
	public void setEligibleForPayments(boolean value) {
		this.eligibleForPayments = value;
	}

	@JsonProperty("requires_extra_payments_agreement")
	public boolean getRequiresExtraPaymentsAgreement() {
		return requiresExtraPaymentsAgreement;
	}

	@JsonProperty("requires_extra_payments_agreement")
	public void setRequiresExtraPaymentsAgreement(boolean value) {
		this.requiresExtraPaymentsAgreement = value;
	}

	@JsonProperty("password_enabled")
	public boolean getPasswordEnabled() {
		return passwordEnabled;
	}

	@JsonProperty("password_enabled")
	public void setPasswordEnabled(boolean value) {
		this.passwordEnabled = value;
	}

	@JsonProperty("has_storefront")
	public boolean getHasStorefront() {
		return hasStorefront;
	}

	@JsonProperty("has_storefront")
	public void setHasStorefront(boolean value) {
		this.hasStorefront = value;
	}

	@JsonProperty("eligible_for_card_reader_giveaway")
	public boolean getEligibleForCardReaderGiveaway() {
		return eligibleForCardReaderGiveaway;
	}

	@JsonProperty("eligible_for_card_reader_giveaway")
	public void setEligibleForCardReaderGiveaway(boolean value) {
		this.eligibleForCardReaderGiveaway = value;
	}

	@JsonProperty("finances")
	public boolean getFinances() {
		return finances;
	}

	@JsonProperty("finances")
	public void setFinances(boolean value) {
		this.finances = value;
	}

	@JsonProperty("primary_location_id")
	public long getPrimaryLocationID() {
		return primaryLocationID;
	}

	@JsonProperty("primary_location_id")
	public void setPrimaryLocationID(long value) {
		this.primaryLocationID = value;
	}

	@JsonProperty("force_ssl")
	public boolean getForceSSL() {
		return forceSSL;
	}

	@JsonProperty("force_ssl")
	public void setForceSSL(boolean value) {
		this.forceSSL = value;
	}

	@JsonProperty("checkout_api_supported")
	public boolean getCheckoutAPISupported() {
		return checkoutAPISupported;
	}

	@JsonProperty("checkout_api_supported")
	public void setCheckoutAPISupported(boolean value) {
		this.checkoutAPISupported = value;
	}

	@JsonProperty("multi_location_enabled")
	public boolean getMultiLocationEnabled() {
		return multiLocationEnabled;
	}

	@JsonProperty("multi_location_enabled")
	public void setMultiLocationEnabled(boolean value) {
		this.multiLocationEnabled = value;
	}

	@JsonProperty("setup_required")
	public boolean getSetupRequired() {
		return setupRequired;
	}

	@JsonProperty("setup_required")
	public void setSetupRequired(boolean value) {
		this.setupRequired = value;
	}

	@JsonProperty("pre_launch_enabled")
	public boolean getPreLaunchEnabled() {
		return preLaunchEnabled;
	}

	@JsonProperty("pre_launch_enabled")
	public void setPreLaunchEnabled(boolean value) {
		this.preLaunchEnabled = value;
	}

	@JsonProperty("enabled_presentment_currencies")
	public List<String> getEnabledPresentmentCurrencies() {
		return enabledPresentmentCurrencies;
	}

	@JsonProperty("enabled_presentment_currencies")
	public void setEnabledPresentmentCurrencies(List<String> value) {
		this.enabledPresentmentCurrencies = value;
	}

}
