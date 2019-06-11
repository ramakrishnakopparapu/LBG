package com.numbertoword.enums;

public enum NumberExceptionMessages {
	
	REQUIREDGREATERNUMBER("Please provide the number greater than zero")
	,REQUIREDLESSNUMBER("Please provide the below 999999999 number");
	
	private String message;
	
	NumberExceptionMessages(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
