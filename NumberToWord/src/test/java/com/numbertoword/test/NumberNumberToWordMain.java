package com.numbertoword.test;

import com.numbertoword.enums.Representation;
import com.numbertoword.exceptions.NotValidNumber;
import com.numbertoword.factory.NumberToWordFactory;
import com.numbertoword.model.NumberToWord;

public class NumberNumberToWordMain {
	public static void main(String[] args) throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		System.out.println(numberword.getnumberword(921));
	}
}
