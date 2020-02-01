package com.telintel.tellafriend.shopify.intregation.service.scripttag.vo;

import java.util.Date;

public class ScriptTag {

	private String id;
	private String src;
	private String event;
	private String display_scope;
	private Date created_at;
	private Date updated_at;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getDisplay_scope() {
		return display_scope;
	}

	public void setDisplay_scope(String display_scope) {
		this.display_scope = display_scope;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
