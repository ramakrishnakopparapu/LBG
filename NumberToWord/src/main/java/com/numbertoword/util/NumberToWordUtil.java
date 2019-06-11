package com.numbertoword.util;

import com.numbertoword.enums.Numbernames;
import com.numbertoword.enums.NumberExceptionMessages;
import com.numbertoword.enums.NumberNamesOnes;
import com.numbertoword.enums.NumberNamesTens;
import com.numbertoword.exceptions.NotValidNumber;

public class NumberToWordUtil {

	public static String NumberMillions(int num) {
		StringBuilder sb = new StringBuilder("");
		sb.append(NumberHundred(num));
		sb.append(Numbernames.MILLION.desc());

		return sb.toString();

	}

	public static String NumberThousand(int num) {
		StringBuilder sb = new StringBuilder("");
		sb.append(NumberHundred(num));
		sb.append(Numbernames.THOUSAND.desc());

		return sb.toString();
	}

	public static String NumberHundred(int num) {
		StringBuilder sb = new StringBuilder();
		int factor = num / Numbernames.HUNDRED.getnumbernamesValue();
		int remainder = num % Numbernames.HUNDRED.getnumbernamesValue();
		if (factor != 0) {
			sb.append(NumberToWordUtil.evaluateHundredDescription(factor));
			sb.append(" ");
		}

		if (remainder != 0) {
			sb.append("and ");
			sb.append(NumberToWordUtil.evaluateTensDescription(remainder)).append(" ");
		}
		return sb.toString();
	}

	public static String evaluateHundredDescription(int num) {
		return new StringBuilder().append(evaluateOnesDescription(num)).append(" ").append(Numbernames.HUNDRED.desc())
				.toString();
	}

	public static String evaluateTensDescription(int num) {
		StringBuilder sb = new StringBuilder();

		for (NumberNamesTens con : NumberNamesTens.values()) {
			if (con.getnumbernamesValue() == num) {
				return sb.append(con.getDescription()).toString();
			}
		}

		int factor = num / Numbernames.TEN.getnumbernamesValue();
		int remainder = num % Numbernames.TEN.getnumbernamesValue();

		if (factor != 0) {
			for (NumberNamesTens con : NumberNamesTens.values()) {
				if (con.getnumbernamesValue() == factor * 10) {
					sb.append(con.getDescription()).toString();
					break;
				}
			}
			sb.append(" ");
		}

		if (remainder != 0) {
			sb.append(NumberToWordUtil.evaluateOnesDescription(remainder));
		}
		return sb.toString();
	}

	public static String evaluateOnesDescription(int num) {
		String result = "";
		for (NumberNamesOnes con : NumberNamesOnes.values()) {
			if (con.getnumbernamesValue() == num) {
				result = con.getDescription();
				break;
			}
		}
		return result;
	}

	public static void validateCurrency(int amount) throws NotValidNumber {
		try {
			if (amount <= 0) {
				throw new NotValidNumber(NumberExceptionMessages.REQUIREDGREATERNUMBER.getMessage());
			} else if (amount > 999999999) {
				throw new NotValidNumber(NumberExceptionMessages.REQUIREDLESSNUMBER.getMessage());
			}
		} catch (Exception e) {
			throw new NotValidNumber(e.getMessage());
		}
	}
}
