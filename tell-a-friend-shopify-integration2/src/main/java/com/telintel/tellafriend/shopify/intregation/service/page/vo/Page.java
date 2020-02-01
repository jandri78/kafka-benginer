package com.telintel.tellafriend.shopify.intregation.service.page.vo;

public class Page {

	private String id;
	private String title;
	private String body_html;

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody_html() {
		return body_html;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody_html(String body_html) {
		this.body_html = body_html;
	}

	@Override
	public String toString() {
		return "Page [id=" + id + ", title=" + title + ", body_html=" + body_html + "]";
	}

}
