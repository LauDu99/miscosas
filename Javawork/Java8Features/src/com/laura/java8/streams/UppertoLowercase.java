package com.laura.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UppertoLowercase {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		
		l1.add("LAURA");
		l1.add("ALE");
		l1.add("YO");
		
		System.out.println(l1);
		
		//convierte de mayusculas a minisculas la misma lista pasada
		List<String> l2 = l1.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
	

}
