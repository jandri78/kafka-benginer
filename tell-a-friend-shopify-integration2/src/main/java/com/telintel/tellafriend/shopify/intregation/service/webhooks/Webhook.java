package com.telintel.tellafriend.shopify.intregation.service.webhooks;

public class Webhook {

	private String topic;
	private String address;
	private String format="json";

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "Webhook [topic=" + topic + ", address=" + address + ", format=" + format + "]";
	}

}
