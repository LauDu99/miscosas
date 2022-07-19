package com.laura.java8.predicates;

import java.util.function.Predicate;

public class Mayorqueveinte {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i->(i>20);
		System.out.println(p.test(15));
		System.out.println(p.test(30));
		System.out.println(p.test(20));
	}

}
