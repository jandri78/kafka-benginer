package com.mkyong;

public enum DripsErrorCodes {

	GENERAL_EXCEPTION("ruta.file"), 
	CRITERIA_NOT_FOUND("criteria.not.found"),
	MISSING_EVENT_ID("missing.event.id");

	private String route;

	private DripsErrorCodes(String route) {
		this.route = route;
		
	}

	public String getRoute() {
		return route;
	}


}