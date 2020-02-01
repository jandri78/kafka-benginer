package com.telintel.tellafriend.shopify.intregation.service.data;

import java.util.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopifyPurchaseEvent {

	private Long id;
	private String email;
	private String token;
	private String gateway;
	private boolean test;
	private Double totalPrice;
	private Double subtotalPrice;
	private long totalWeight;
	private Double totalTax;
	private boolean taxesIncluded;
	private String currency;
	private String financialStatus;
	private boolean confirmed;
	private String totalDiscounts;
	private String totalLineItemsPrice;
	private String cartToken;
	private boolean buyerAcceptsMarketing;
	private String name;
	private String referringSite;
	private String landingSite;
	private String totalPriceUsd;
	private String checkoutToken;
	private Object reference;
	private Object userID;
	private Object locationID;
	private Object sourceIdentifier;
	private Object sourceURL;
	private String processedAt;
	private Object deviceID;
	private String phone;
	private String customerLocale;
	private long appID;
	private String browserIP;
	private Object landingSiteRef;
	private long orderNumber;
	private DiscountApplication[] discountApplications;
	private DiscountCode[] discountCodes;
	private Object[] noteAttributes;
	private String[] paymentGatewayNames;
	private String processingMethod;
	private long checkoutID;
	private String sourceName;
	private Object fulfillmentStatus;
	private TaxLine[] taxLines;
	private String tags;
	private String contactEmail;
	private String orderStatusURL;
	private String presentmentCurrency;
	private Set totalLineItemsPriceSet;
	private Set totalDiscountsSet;
	private Set totalShippingPriceSet;
	private Set subtotalPriceSet;
	private Set totalPriceSet;
	private Set totalTaxSet;
	private LineItem[] lineItems;
	private Object[] fulfillments;
	private Object[] refunds;
	private String totalTipReceived;
	private String adminGraphqlAPIID;
	private ShippingLine[] shippingLines;
	private Address billingAddress;
	private Address shippingAddress;
	private ClientDetails clientDetails;
	private Customer customer;

	@JsonProperty("id")
	public long getID() {
		return id;
	}

	@JsonProperty("id")
	public void setID(long value) {
		this.id = value;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String value) {
		this.email = value;
	}

	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	@JsonProperty("token")
	public void setToken(String value) {
		this.token = value;
	}

	@JsonProperty("gateway")
	public String getGateway() {
		return gateway;
	}

	@JsonProperty("gateway")
	public void setGateway(String value) {
		this.gateway = value;
	}

	@JsonProperty("test")
	public boolean getTest() {
		return test;
	}

	@JsonProperty("test")
	public void setTest(boolean value) {
		this.test = value;
	}

	@JsonProperty("total_price")
	public Double getTotalPrice() {
		return totalPrice;
	}

	@JsonProperty("total_price")
	public void setTotalPrice(Double value) {
		this.totalPrice = value;
	}

	@JsonProperty("subtotal_price")
	public Double getSubtotalPrice() {
		return subtotalPrice;
	}

	@JsonProperty("subtotal_price")
	public void setSubtotalPrice(Double value) {
		this.subtotalPrice = value;
	}

	@JsonProperty("total_weight")
	public long getTotalWeight() {
		return totalWeight;
	}

	@JsonProperty("total_weight")
	public void setTotalWeight(long value) {
		this.totalWeight = value;
	}

	@JsonProperty("total_tax")
	public Double getTotalTax() {
		return totalTax;
	}

	@JsonProperty("total_tax")
	public void setTotalTax(Double value) {
		this.totalTax = value;
	}

	@JsonProperty("taxes_included")
	public boolean getTaxesIncluded() {
		return taxesIncluded;
	}

	@JsonProperty("taxes_included")
	public void setTaxesIncluded(boolean value) {
		this.taxesIncluded = value;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String value) {
		this.currency = value;
	}

	@JsonProperty("financial_status")
	public String getFinancialStatus() {
		return financialStatus;
	}

	@JsonProperty("financial_status")
	public void setFinancialStatus(String value) {
		this.financialStatus = value;
	}

	@JsonProperty("confirmed")
	public boolean getConfirmed() {
		return confirmed;
	}

	@JsonProperty("confirmed")
	public void setConfirmed(boolean value) {
		this.confirmed = value;
	}

	@JsonProperty("total_discounts")
	public String getTotalDiscounts() {
		return totalDiscounts;
	}

	@JsonProperty("total_discounts")
	public void setTotalDiscounts(String value) {
		this.totalDiscounts = value;
	}

	@JsonProperty("total_line_items_price")
	public String getTotalLineItemsPrice() {
		return totalLineItemsPrice;
	}

	@JsonProperty("total_line_items_price")
	public void setTotalLineItemsPrice(String value) {
		this.totalLineItemsPrice = value;
	}

	@JsonProperty("cart_token")
	public String getCartToken() {
		return cartToken;
	}

	@JsonProperty("cart_token")
	public void setCartToken(String value) {
		this.cartToken = value;
	}

	@JsonProperty("buyer_accepts_marketing")
	public boolean getBuyerAcceptsMarketing() {
		return buyerAcceptsMarketing;
	}

	@JsonProperty("buyer_accepts_marketing")
	public void setBuyerAcceptsMarketing(boolean value) {
		this.buyerAcceptsMarketing = value;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String value) {
		this.name = value;
	}

	@JsonProperty("referring_site")
	public String getReferringSite() {
		return referringSite;
	}

	@JsonProperty("referring_site")
	public void setReferringSite(String value) {
		this.referringSite = value;
	}

	@JsonProperty("landing_site")
	public String getLandingSite() {
		return landingSite;
	}

	@JsonProperty("landing_site")
	public void setLandingSite(String value) {
		this.landingSite = value;
	}

	@JsonProperty("total_price_usd")
	public String getTotalPriceUsd() {
		return totalPriceUsd;
	}

	@JsonProperty("total_price_usd")
	public void setTotalPriceUsd(String value) {
		this.totalPriceUsd = value;
	}

	@JsonProperty("checkout_token")
	public String getCheckoutToken() {
		return checkoutToken;
	}

	@JsonProperty("checkout_token")
	public void setCheckoutToken(String value) {
		this.checkoutToken = value;
	}

	@JsonProperty("reference")
	public Object getReference() {
		return reference;
	}

	@JsonProperty("reference")
	public void setReference(Object value) {
		this.reference = value;
	}

	@JsonProperty("user_id")
	public Object getUserID() {
		return userID;
	}

	@JsonProperty("user_id")
	public void setUserID(Object value) {
		this.userID = value;
	}

	@JsonProperty("location_id")
	public Object getLocationID() {
		return locationID;
	}

	@JsonProperty("location_id")
	public void setLocationID(Object value) {
		this.locationID = value;
	}

	@JsonProperty("source_identifier")
	public Object getSourceIdentifier() {
		return sourceIdentifier;
	}

	@JsonProperty("source_identifier")
	public void setSourceIdentifier(Object value) {
		this.sourceIdentifier = value;
	}

	@JsonProperty("source_url")
	public Object getSourceURL() {
		return sourceURL;
	}

	@JsonProperty("source_url")
	public void setSourceURL(Object value) {
		this.sourceURL = value;
	}

	@JsonProperty("processed_at")
	public String getProcessedAt() {
		return processedAt;
	}

	@JsonProperty("processed_at")
	public void setProcessedAt(String value) {
		this.processedAt = value;
	}

	@JsonProperty("device_id")
	public Object getDeviceID() {
		return deviceID;
	}

	@JsonProperty("device_id")
	public void setDeviceID(Object value) {
		this.deviceID = value;
	}

	@JsonProperty("phone")
	public Object getPhone() {
		return phone;
	}

	@JsonProperty("customer_locale")
	public String getCustomerLocale() {
		return customerLocale;
	}

	@JsonProperty("customer_locale")
	public void setCustomerLocale(String value) {
		this.customerLocale = value;
	}

	@JsonProperty("app_id")
	public long getAppID() {
		return appID;
	}

	@JsonProperty("app_id")
	public void setAppID(long value) {
		this.appID = value;
	}

	@JsonProperty("browser_ip")
	public String getBrowserIP() {
		return browserIP;
	}

	@JsonProperty("browser_ip")
	public void setBrowserIP(String value) {
		this.browserIP = value;
	}

	@JsonProperty("landing_site_ref")
	public Object getLandingSiteRef() {
		return landingSiteRef;
	}

	@JsonProperty("landing_site_ref")
	public void setLandingSiteRef(Object value) {
		this.landingSiteRef = value;
	}

	@JsonProperty("order_number")
	public long getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("order_number")
	public void setOrderNumber(long value) {
		this.orderNumber = value;
	}

	@JsonProperty("discount_applications")
	public DiscountApplication[] getDiscountApplications() {
		return discountApplications;
	}

	@JsonProperty("discount_applications")
	public void setDiscountApplications(DiscountApplication[] value) {
		this.discountApplications = value;
	}

	@JsonProperty("discount_codes")
	public DiscountCode[] getDiscountCodes() {
		return discountCodes;
	}

	@JsonProperty("discount_codes")
	public void setDiscountCodes(DiscountCode[] value) {
		this.discountCodes = value;
	}

	@JsonProperty("note_attributes")
	public Object[] getNoteAttributes() {
		return noteAttributes;
	}

	@JsonProperty("note_attributes")
	public void setNoteAttributes(Object[] value) {
		this.noteAttributes = value;
	}

	@JsonProperty("payment_gateway_names")
	public String[] getPaymentGatewayNames() {
		return paymentGatewayNames;
	}

	@JsonProperty("payment_gateway_names")
	public void setPaymentGatewayNames(String[] value) {
		this.paymentGatewayNames = value;
	}

	@JsonProperty("processing_method")
	public String getProcessingMethod() {
		return processingMethod;
	}

	@JsonProperty("processing_method")
	public void setProcessingMethod(String value) {
		this.processingMethod = value;
	}

	@JsonProperty("checkout_id")
	public long getCheckoutID() {
		return checkoutID;
	}

	@JsonProperty("checkout_id")
	public void setCheckoutID(long value) {
		this.checkoutID = value;
	}

	@JsonProperty("source_name")
	public String getSourceName() {
		return sourceName;
	}

	@JsonProperty("source_name")
	public void setSourceName(String value) {
		this.sourceName = value;
	}

	@JsonProperty("fulfillment_status")
	public Object getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	@JsonProperty("fulfillment_status")
	public void setFulfillmentStatus(Object value) {
		this.fulfillmentStatus = value;
	}

	@JsonProperty("tax_lines")
	public TaxLine[] getTaxLines() {
		return taxLines;
	}

	@JsonProperty("tax_lines")
	public void setTaxLines(TaxLine[] value) {
		this.taxLines = value;
	}

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String value) {
		this.tags = value;
	}

	@JsonProperty("contact_email")
	public String getContactEmail() {
		return contactEmail;
	}

	@JsonProperty("contact_email")
	public void setContactEmail(String value) {
		this.contactEmail = value;
	}

	@JsonProperty("order_status_url")
	public String getOrderStatusURL() {
		return orderStatusURL;
	}

	@JsonProperty("order_status_url")
	public void setOrderStatusURL(String value) {
		this.orderStatusURL = value;
	}

	@JsonProperty("presentment_currency")
	public String getPresentmentCurrency() {
		return presentmentCurrency;
	}

	@JsonProperty("presentment_currency")
	public void setPresentmentCurrency(String value) {
		this.presentmentCurrency = value;
	}

	@JsonProperty("total_line_items_price_set")
	public Set getTotalLineItemsPriceSet() {
		return totalLineItemsPriceSet;
	}

	@JsonProperty("total_line_items_price_set")
	public void setTotalLineItemsPriceSet(Set value) {
		this.totalLineItemsPriceSet = value;
	}

	@JsonProperty("total_discounts_set")
	public Set getTotalDiscountsSet() {
		return totalDiscountsSet;
	}

	@JsonProperty("total_discounts_set")
	public void setTotalDiscountsSet(Set value) {
		this.totalDiscountsSet = value;
	}

	@JsonProperty("total_shipping_price_set")
	public Set getTotalShippingPriceSet() {
		return totalShippingPriceSet;
	}

	@JsonProperty("total_shipping_price_set")
	public void setTotalShippingPriceSet(Set value) {
		this.totalShippingPriceSet = value;
	}

	@JsonProperty("subtotal_price_set")
	public Set getSubtotalPriceSet() {
		return subtotalPriceSet;
	}

	@JsonProperty("subtotal_price_set")
	public void setSubtotalPriceSet(Set value) {
		this.subtotalPriceSet = value;
	}

	@JsonProperty("total_price_set")
	public Set getTotalPriceSet() {
		return totalPriceSet;
	}

	@JsonProperty("total_price_set")
	public void setTotalPriceSet(Set value) {
		this.totalPriceSet = value;
	}

	@JsonProperty("total_tax_set")
	public Set getTotalTaxSet() {
		return totalTaxSet;
	}

	@JsonProperty("total_tax_set")
	public void setTotalTaxSet(Set value) {
		this.totalTaxSet = value;
	}

	@JsonProperty("line_items")
	public LineItem[] getLineItems() {
		return lineItems;
	}

	@JsonProperty("line_items")
	public void setLineItems(LineItem[] value) {
		this.lineItems = value;
	}

	@JsonProperty("fulfillments")
	public Object[] getFulfillments() {
		return fulfillments;
	}

	@JsonProperty("fulfillments")
	public void setFulfillments(Object[] value) {
		this.fulfillments = value;
	}

	@JsonProperty("refunds")
	public Object[] getRefunds() {
		return refunds;
	}

	@JsonProperty("refunds")
	public void setRefunds(Object[] value) {
		this.refunds = value;
	}

	@JsonProperty("total_tip_received")
	public String getTotalTipReceived() {
		return totalTipReceived;
	}

	@JsonProperty("total_tip_received")
	public void setTotalTipReceived(String value) {
		this.totalTipReceived = value;
	}

	@JsonProperty("admin_graphql_api_id")
	public String getAdminGraphqlAPIID() {
		return adminGraphqlAPIID;
	}

	@JsonProperty("admin_graphql_api_id")
	public void setAdminGraphqlAPIID(String value) {
		this.adminGraphqlAPIID = value;
	}

	@JsonProperty("shipping_lines")
	public ShippingLine[] getShippingLines() {
		return shippingLines;
	}

	@JsonProperty("shipping_lines")
	public void setShippingLines(ShippingLine[] value) {
		this.shippingLines = value;
	}

	@JsonProperty("billing_address")
	public Address getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("billing_address")
	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	@JsonProperty("shipping_address")
	public Address getShippingAddress() {
		return shippingAddress;
	}

	@JsonProperty("shipping_address")
	public void setShippingAddress(Address value) {
		this.shippingAddress = value;
	}

	@JsonProperty("client_details")
	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	@JsonProperty("client_details")
	public void setClientDetails(ClientDetails value) {
		this.clientDetails = value;
	}

	@JsonProperty("customer")
	public Customer getCustomer() {
		return customer;
	}

	@JsonProperty("customer")
	public void setCustomer(Customer value) {
		this.customer = value;
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

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Event [" + (id != null ? "id=" + id + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ (token != null ? "token=" + token + ", " : "") + (gateway != null ? "gateway=" + gateway + ", " : "")
				+ "test=" + test + ", " + (totalPrice != null ? "totalPrice=" + totalPrice + ", " : "")
				+ (subtotalPrice != null ? "subtotalPrice=" + subtotalPrice + ", " : "") + "totalWeight=" + totalWeight
				+ ", " + (totalTax != null ? "totalTax=" + totalTax + ", " : "") + "taxesIncluded=" + taxesIncluded
				+ ", " + (currency != null ? "currency=" + currency + ", " : "")
				+ (financialStatus != null ? "financialStatus=" + financialStatus + ", " : "") + "confirmed="
				+ confirmed + ", " + (totalDiscounts != null ? "totalDiscounts=" + totalDiscounts + ", " : "")
				+ (totalLineItemsPrice != null ? "totalLineItemsPrice=" + totalLineItemsPrice + ", " : "")
				+ (cartToken != null ? "cartToken=" + cartToken + ", " : "") + "buyerAcceptsMarketing="
				+ buyerAcceptsMarketing + ", " + (name != null ? "name=" + name + ", " : "")
				+ (referringSite != null ? "referringSite=" + referringSite + ", " : "")
				+ (landingSite != null ? "landingSite=" + landingSite + ", " : "")
				+ (totalPriceUsd != null ? "totalPriceUsd=" + totalPriceUsd + ", " : "")
				+ (checkoutToken != null ? "checkoutToken=" + checkoutToken + ", " : "")
				+ (reference != null ? "reference=" + reference + ", " : "")
				+ (userID != null ? "userID=" + userID + ", " : "")
				+ (locationID != null ? "locationID=" + locationID + ", " : "")
				+ (sourceIdentifier != null ? "sourceIdentifier=" + sourceIdentifier + ", " : "")
				+ (sourceURL != null ? "sourceURL=" + sourceURL + ", " : "")
				+ (processedAt != null ? "processedAt=" + processedAt + ", " : "")
				+ (deviceID != null ? "deviceID=" + deviceID + ", " : "")
				+ (phone != null ? "phone=" + phone + ", " : "")
				+ (customerLocale != null ? "customerLocale=" + customerLocale + ", " : "") + "appID=" + appID + ", "
				+ (browserIP != null ? "browserIP=" + browserIP + ", " : "")
				+ (landingSiteRef != null ? "landingSiteRef=" + landingSiteRef + ", " : "") + "orderNumber="
				+ orderNumber + ", "
				+ (discountApplications != null ? "discountApplications="
						+ Arrays.asList(discountApplications).subList(0, Math.min(discountApplications.length, maxLen))
						+ ", " : "")
				+ (discountCodes != null
						? "discountCodes="
								+ Arrays.asList(discountCodes).subList(0, Math.min(discountCodes.length, maxLen)) + ", "
						: "")
				+ (noteAttributes != null ? "noteAttributes="
						+ Arrays.asList(noteAttributes).subList(0, Math.min(noteAttributes.length, maxLen)) + ", " : "")
				+ (paymentGatewayNames != null ? "paymentGatewayNames="
						+ Arrays.asList(paymentGatewayNames).subList(0, Math.min(paymentGatewayNames.length, maxLen))
						+ ", " : "")
				+ (processingMethod != null ? "processingMethod=" + processingMethod + ", " : "") + "checkoutID="
				+ checkoutID + ", " + (sourceName != null ? "sourceName=" + sourceName + ", " : "")
				+ (fulfillmentStatus != null ? "fulfillmentStatus=" + fulfillmentStatus + ", " : "")
				+ (taxLines != null
						? "taxLines=" + Arrays.asList(taxLines).subList(0, Math.min(taxLines.length, maxLen)) + ", "
						: "")
				+ (tags != null ? "tags=" + tags + ", " : "")
				+ (contactEmail != null ? "contactEmail=" + contactEmail + ", " : "")
				+ (orderStatusURL != null ? "orderStatusURL=" + orderStatusURL + ", " : "")
				+ (presentmentCurrency != null ? "presentmentCurrency=" + presentmentCurrency + ", " : "")
				+ (totalLineItemsPriceSet != null ? "totalLineItemsPriceSet=" + totalLineItemsPriceSet + ", " : "")
				+ (totalDiscountsSet != null ? "totalDiscountsSet=" + totalDiscountsSet + ", " : "")
				+ (totalShippingPriceSet != null ? "totalShippingPriceSet=" + totalShippingPriceSet + ", " : "")
				+ (subtotalPriceSet != null ? "subtotalPriceSet=" + subtotalPriceSet + ", " : "")
				+ (totalPriceSet != null ? "totalPriceSet=" + totalPriceSet + ", " : "")
				+ (totalTaxSet != null ? "totalTaxSet=" + totalTaxSet + ", " : "")
				+ (lineItems != null
						? "lineItems=" + Arrays.asList(lineItems).subList(0, Math.min(lineItems.length, maxLen)) + ", "
						: "")
				+ (fulfillments != null
						? "fulfillments="
								+ Arrays.asList(fulfillments).subList(0, Math.min(fulfillments.length, maxLen)) + ", "
						: "")
				+ (refunds != null
						? "refunds=" + Arrays.asList(refunds).subList(0, Math.min(refunds.length, maxLen)) + ", "
						: "")
				+ (totalTipReceived != null ? "totalTipReceived=" + totalTipReceived + ", " : "")
				+ (adminGraphqlAPIID != null ? "adminGraphqlAPIID=" + adminGraphqlAPIID + ", " : "")
				+ (shippingLines != null
						? "shippingLines="
								+ Arrays.asList(shippingLines).subList(0, Math.min(shippingLines.length, maxLen)) + ", "
						: "")
				+ (billingAddress != null ? "billingAddress=" + billingAddress + ", " : "")
				+ (shippingAddress != null ? "shippingAddress=" + shippingAddress + ", " : "")
				+ (clientDetails != null ? "clientDetails=" + clientDetails + ", " : "")
				+ (customer != null ? "customer=" + customer : "") + "]";
	}

}
