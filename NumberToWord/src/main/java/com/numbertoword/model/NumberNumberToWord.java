package com.numbertoword.model;

import com.numbertoword.enums.Numbernames;
import com.numbertoword.exceptions.NotValidNumber;
import com.numbertoword.util.NumberToWordUtil;

public class NumberNumberToWord extends NumberToWord {
	
	@Override
	public String getnumberword(int amount) throws NotValidNumber {
		NumberToWordUtil.validateCurrency(amount);
		StringBuilder sb = new StringBuilder("");
		
		int factor = amount/Numbernames.MILLION.getnumbernamesValue();
		int  remainder = amount%Numbernames.MILLION.getnumbernamesValue();
		
		if (factor != 0) {
			sb.append(NumberToWordUtil.NumberMillions(factor));
			sb.append(" ");
		}
		
		if (remainder != 0) {
			sb.append("and ");
		}
		
		factor = remainder/Numbernames.THOUSAND.getnumbernamesValue();
		remainder = remainder%Numbernames.THOUSAND.getnumbernamesValue();
		if (factor != 0) {
			sb.append(NumberToWordUtil.NumberThousand(factor));
			sb.append(" ");
		}
		sb.append(NumberToWordUtil.NumberHundred(remainder));
		
		return sb.toString().replaceAll("^(and.)*", "").trim();
	}

}
