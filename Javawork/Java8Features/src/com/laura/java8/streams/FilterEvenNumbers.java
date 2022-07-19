package com.laura.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);

		/*
		 * List<Integer> l2 = new ArrayList<Integer>(); for(int i =0;i<=10;i++) {
		 * l2.add(i); }
		 */
		// stream regresa una secuencia de la coleccion. para hacer un colector, primero
		// filtras los datos, luego punto collect y lo
		// recolectas en una lista
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
		//contar los valores
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println("total de pares son: "+count);
		
		//ordenar los numeros de mayor a menor o al reves
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
		System.out.println();
		//ordenar los numeros secuencialmente
		List<Integer> collect = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(collect);
		
		//obtener el mas alto, se necesita crear con un comparador
		Integer max = l1.stream().max(comp).get();
		System.out.println(max);
		
		//obtener el minimo o mas bajo 
		Integer min = l1.stream().min(comp).get();
		System.out.println(min);
		
		//mostrar los datos en lista para mostrarlos
		
		l1.stream().forEach(i->System.out.println(i));
		
		
		
	}

}
