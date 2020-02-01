package com.mkyong;

public class IncorrectFileNameException extends Exception {

	public IncorrectFileNameException(String errorMessage) {
		super(errorMessage);
	}
	public IncorrectFileNameException(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}

}