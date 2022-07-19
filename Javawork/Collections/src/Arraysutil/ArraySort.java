package Arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
	public static void main(String[] args) {
		
		int[] a = {40,10,15,7};
		
		System.out.println("Before sort:");
		for(int eachElement : a) {
			System.out.println(eachElement);
		}
		
		Arrays.sort(a);//ordena el array
		
		for(int eachElement : a) {
			System.out.println(eachElement);
		}
		System.out.println("New Array:");
		String[] s = {"V", "A", "Z", "P"};
		//Arrays.sort(s, new MyComparator());//muestra al reves
		
		for(String eachString : s) {
			System.out.println(eachString);
		}
		//debes asignarlo a una variable para que funcione
		int na = Arrays.binarySearch(s, "Z");
		System.out.println(na);
		//convertir de array a lista
		List<String> asList = Arrays.asList(s);
	}
}
