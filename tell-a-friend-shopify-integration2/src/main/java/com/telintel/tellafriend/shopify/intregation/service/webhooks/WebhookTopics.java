package com.telintel.tellafriend.shopify.intregation.service.webhooks;

public enum WebhookTopics {

	ORDERS_PAID("orders/paid");

	private String topic;

	public String getTopic() {
		return topic;
	}

	WebhookTopics(String topic) {
		this.topic = topic;
	}

}
