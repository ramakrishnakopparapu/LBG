package com.numbertoword.model;

import com.numbertoword.exceptions.NotValidNumber;

public abstract class NumberToWord {
	
	public abstract String getnumberword(int amount) throws NotValidNumber;
	
}
