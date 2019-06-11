package com.numbertoword.factory;

import com.numbertoword.enums.Representation;
import com.numbertoword.model.NumberToWord;
import com.numbertoword.model.NumberNumberToWord;

public class NumberToWordFactory {

	public static NumberToWord getnumtoword(Representation representation) {
		NumberToWord numtoword;
		switch (representation) {
		case NUMBER:
			numtoword = new NumberNumberToWord();
			break;
		default:
			numtoword = null;
			break;
		}
		return numtoword;
	}
}
