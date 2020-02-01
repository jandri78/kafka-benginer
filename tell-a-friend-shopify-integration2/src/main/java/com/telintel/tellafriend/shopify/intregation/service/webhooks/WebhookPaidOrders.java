package com.telintel.tellafriend.shopify.intregation.service.webhooks;

import com.telintel.tellafriend.shopify.intregation.service.data.ShopifyPurchaseEvent;

public class WebhookPaidOrders extends WebhookEvent {

	private ShopifyPurchaseEvent event;

	public WebhookPaidOrders(ShopifyPurchaseEvent event) {
		super(WebhookTopics.ORDERS_PAID);
		this.event = event;
	}

	public ShopifyPurchaseEvent getEvent() {
		return event;
	}

}
