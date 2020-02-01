package com.mkyong;

import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class DripsParserException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private final DripsErrorCodes code;
	
	//message
	public DripsParserException(String message, DripsErrorCodes code) {
		super(message);
		this.code= code;
	}
	
	//personalized message 
	public DripsParserException(DripsErrorCodes code,String locale) {
		super(ResourceBundle.getBundle("exceptions",new Locale(Objects.isNull(locale)?"en":locale)).getString(code.getRoute()));
		this.code = code;
	}
	
	//message + throwable
	public DripsParserException(String message, Throwable cause, DripsErrorCodes code) {
		super(message, cause);
		this.code = code;
	}

	//personalized message  + throwable
	public DripsParserException(DripsErrorCodes code, String locale,Throwable cause) {
		super(ResourceBundle.getBundle("exceptions",new Locale(locale)).getString(code.getRoute()),cause);
		this.code = code;
	}

	public DripsErrorCodes getCode() {
		return code;
	}

}