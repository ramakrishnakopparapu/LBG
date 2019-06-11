package com.numbertoword.enums;

public enum NumberNamesTens {

	Ten(10, "ten")
	,ELEVEN(11,"eleven")
	,TWELVE(12,"twelve")
	,THIRTEEN(13,"thirteen")
	,FOURTEEN(14,"fourteen")
	,FIFTEEN(15,"fifteen")
	,SIXTEEN(16,"sixteen")
	,SEVENTEEN(17,"seventeen")
	,EIGHTEEN(18,"eighteen")
	,NINTEEN(19, "ninteen")
	,TWENTY(20, "twenty")
	,THIRTY(30, "thirty")
	,FOURTY(40, "fourty")
	,FIFTY(50, "fifty")
	,SIXTY(60, "sixty")
	,SEVENTY(70, "seventy")
	,EIGHTY(80, "eighty")
	,NINETY(90, "ninty");
	
	private int numbernamesValue;
	private String description;
	
	NumberNamesTens(int numbernamesValue, String description) {
		this.numbernamesValue = numbernamesValue;
		this.description = description;
	}
	
	public int getnumbernamesValue() {
		return this.numbernamesValue;
	}

	public String getDescription() {
		return this.description;
	}
	
}
