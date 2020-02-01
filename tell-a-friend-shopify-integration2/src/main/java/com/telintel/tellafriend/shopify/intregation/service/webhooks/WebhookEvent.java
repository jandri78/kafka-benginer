package com.telintel.tellafriend.shopify.intregation.service.webhooks;

public abstract class WebhookEvent {

	public WebhookEvent(WebhookTopics topic) {
		this.topic = topic;
	}

	public WebhookTopics topic;

	public WebhookTopics getTopic() {
		return topic;
	}
}
