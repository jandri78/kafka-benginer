package com.telintel.tellafriend.shopify.intregation.service.webhooks;

public class WebhookWrapper {

	public WebhookWrapper() {
	}

	private Webhook webhook;

	public WebhookWrapper(Webhook webhook2) {
		this.webhook = webhook2;
	}

	public Webhook getWebhook() {
		return webhook;
	}

	public void setWebhook(Webhook webhook) {
		this.webhook = webhook;
	}

}
