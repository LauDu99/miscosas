package com.laura.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidator {

	public static void main(String[] args) {
		//pattern compile toma una cadena y devuelve un objeto de patron
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		Matcher matcher = pattern.matcher("laura@laura.com");
		if(matcher.matches()) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
	}

}
