package com.laura.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("double");	
	}
	
	public Addition(int a, int b) {
		System.out.println("int");	
	}
	
	public Addition(String a, String b) {
		System.out.println("String");	
	}
}
