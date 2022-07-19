package com.laura.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternandMatcher {

	public static void main(String[] args) {
		
		String number="1234567890";
		
		if (number.matches("^\\d{10}$")) {
			System.out.println("Valid cell no");
		} else {
			System.out.println("Invalid cell no");
		}
	}

}
