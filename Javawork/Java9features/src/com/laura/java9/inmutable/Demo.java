package com.laura.java9.inmutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		//una lista no modificable
		//son colleciones inmutables
		List<String> list = List.of("abc", "xyz", "nyc");
		Set<String> set = Set.of("abc","xyz");
		Map.of(1,2);
		Map.ofEntries();
	}

}
