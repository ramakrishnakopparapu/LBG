package com.numbertoword.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.numbertoword.enums.Representation;
import com.numbertoword.exceptions.NotValidNumber;
import com.numbertoword.factory.NumberToWordFactory;
import com.numbertoword.model.NumberToWord;

public class TestNumberNumberToWord {

	@Test
	public void Number0() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		assertEquals("five", numberword.getnumberword(5));
	}

	@Test
	public void Number1() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		assertEquals("one hundred and two", numberword.getnumberword(102));
	}

	@Test
	public void Number2() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		assertEquals("twenty two", numberword.getnumberword(22));
	}

	@Test
	public void Number3() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		assertEquals("one thousand", numberword.getnumberword(1000));
	}

	@Test(expected = NotValidNumber.class)
	public void Number4() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		numberword.getnumberword(-985697);
	}

	@Test(expected = NotValidNumber.class)
	public void Number5() throws NotValidNumber {
		NumberToWord numberword = NumberToWordFactory.getnumtoword(Representation.NUMBER);
		numberword.getnumberword(-548796);
	}

}
