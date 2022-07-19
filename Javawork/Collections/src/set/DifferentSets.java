package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random obj = new Random();
		
		HashSet<Integer> set = new HashSet<>(); //Muestra una lista sin numeros repetidos
		
		//LinkedHashSet<Integer> set = new LinkedHashSet<>();//Ordena los elementos
		
		//Set<Integer> set = new TreeSet<>();//ordena los elementos ascendentemente
		
		for(int i =0; i<=5;i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
		}
		
		System.out.println("HashSet elements: "+ set);
//		System.out.println("LinkedHashSe elements " + set);
//		System.out.println("TreeSet"+set);
	}

}
