package com.bharat.java9.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,40,30,7,18,23);
		
		//toma los valores hasta que la condicion se cumple
		System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
		//toma los valores hasta que la condicion se deje de cumplir
		System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));
		//elimina el error de puntos nulos
		System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));
	}

}
