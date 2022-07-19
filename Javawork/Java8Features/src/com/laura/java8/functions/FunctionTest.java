package com.laura.java8.functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> s = p->p.length();
		System.out.println(s.apply("Laura"));
		System.out.println(s.apply("Milton"));
		
	}

}
