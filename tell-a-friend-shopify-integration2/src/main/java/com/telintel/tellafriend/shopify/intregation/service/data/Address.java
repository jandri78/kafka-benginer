package com.telintel.tellafriend.shopify.intregation.service.data;

import com.fasterxml.jackson.annotation.*;

public class Address {

	private String firstName;
	private String address1;
	private String phone;
	private String city;
	private String zip;
	private String province;
	private String country;
	private String lastName;
	private String address2;
	private String company;
	private Double latitude;
	private Double longitude;
	private String name;
	private String countryCode;
	private String provinceCode;
	private Long id;
	private Long customerID;
	private String countryName;
	private Boolean addressDefault;

	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("first_name")
	public void setFirstName(String value) {
		this.firstName = value;
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return address1;
	}

	@JsonProperty("address1")
	public void setAddress1(String value) {
		this.address1 = value;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String value) {
		this.phone = value;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String value) {
		this.city = value;
	}

	@JsonProperty("zip")
	public String getZip() {
		return zip;
	}

	@JsonProperty("zip")
	public void setZip(String value) {
		this.zip = value;
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

	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("last_name")
	public void setLastName(String value) {
		this.lastName = value;
	}

	@JsonProperty("address2")
	public String getAddress2() {
		return address2;
	}

	@JsonProperty("address2")
	public void setAddress2(String value) {
		this.address2 = value;
	}

	@JsonProperty("company")
	public String getCompany() {
		return company;
	}

	@JsonProperty("company")
	public void setCompany(String value) {
		this.company = value;
	}

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double value) {
		this.latitude = value;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double value) {
		this.longitude = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("country_code")
	public String getCountryCode() {
		return countryCode;
	}

	@JsonProperty("country_code")
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	@JsonProperty("province_code")
	public String getProvinceCode() {
		return provinceCode;
	}

	@JsonProperty("province_code")
	public void setProvinceCode(String value) {
		this.provinceCode = value;
	}

	@JsonProperty("id")
	public Long getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(Long value) {
		this.id = value;
	}

	@JsonProperty("customer_id")
	public Long getCustomerID() {
		return customerID;
	}

	@JsonProperty("customer_id")
	public void setCustomerID(Long value) {
		this.customerID = value;
	}

	@JsonProperty("country_name")
	public String getCountryName() {
		return countryName;
	}

	@JsonProperty("country_name")
	public void setCountryName(String value) {
		this.countryName = value;
	}

	@JsonProperty("default")
	public Boolean getAddressDefault() {
		return addressDefault;
	}

	@JsonProperty("default")
	public void setAddressDefault(Boolean value) {
		this.addressDefault = value;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Address [" + (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (address1 != null ? "address1=" + address1 + ", " : "")
				+ (phone != null ? "phone=" + phone + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (zip != null ? "zip=" + zip + ", " : "") + (province != null ? "province=" + province + ", " : "")
				+ (country != null ? "country=" + country + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (address2 != null ? "address2=" + address2 + ", " : "")
				+ (company != null ? "company=" + company + ", " : "")
				+ (latitude != null ? "latitude=" + latitude + ", " : "")
				+ (longitude != null ? "longitude=" + longitude + ", " : "")
				+ (name != null ? "name=" + name + ", " : "")
				+ (countryCode != null ? "countryCode=" + countryCode + ", " : "")
				+ (provinceCode != null ? "provinceCode=" + provinceCode + ", " : "")
				+ (id != null ? "id=" + id + ", " : "") + (customerID != null ? "customerID=" + customerID + ", " : "")
				+ (countryName != null ? "countryName=" + countryName + ", " : "")
				+ (addressDefault != null ? "addressDefault=" + addressDefault : "") + "]";
	}

}
