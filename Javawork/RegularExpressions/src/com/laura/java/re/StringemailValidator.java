package com.laura.java.re;

public class StringemailValidator {

	public static void main(String[] args) {
		
		String email = "Laura@laura.com";
		
		if(email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
	}

}
