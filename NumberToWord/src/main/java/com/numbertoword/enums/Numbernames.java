package com.numbertoword.enums;

public enum Numbernames {
	ONE(1,"one"),
	TEN(10,"ten"),
	HUNDRED(100, "hundred"),
	THOUSAND(1000,"thousand"),
	MILLION(1000000,"million");
	
	
	private int numbernamesValue;
	private String description;
	
	Numbernames(int numbernamesValue, String description) {
		this.numbernamesValue = numbernamesValue;
		this.description = description;
	}
	
	public String desc() {
		return this.description;
	}
	
	public int getnumbernamesValue() {
		return this.numbernamesValue;
	}
}
