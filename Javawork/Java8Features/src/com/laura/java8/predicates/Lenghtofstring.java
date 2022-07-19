package com.laura.java8.predicates;

import java.util.function.Predicate;

public class Lenghtofstring {

	public static void main(String[] args) {
		Predicate<String> p = s ->(s.length()>5);
		
		System.out.println("xyz");

		System.out.println("Lauraa");
	}

}
