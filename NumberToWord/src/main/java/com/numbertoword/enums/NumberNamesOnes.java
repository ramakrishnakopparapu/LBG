package com.numbertoword.enums;

public enum NumberNamesOnes {

	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7,"seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine");

	private String description;
	private int numbernamesValue;

	NumberNamesOnes(int numbernamesValue, String description) {
		this.numbernamesValue = numbernamesValue;
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

	public int getnumbernamesValue() {
		return this.numbernamesValue;
	}
	
}
