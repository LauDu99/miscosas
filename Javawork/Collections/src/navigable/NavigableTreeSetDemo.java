package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		//mayor o igual al elemento dado
		System.out.println(s.ceiling(20));
		
		//el valor mas alto que el elemento dado
		System.out.println(s.higher(40));
		
		//el elemento mas alto que sea menor o igual que 10
		System.out.println(s.floor(10));
		
		//el elemento mas alto que es menor que el que damos
		System.out.println(s.lower(30));
		
		//toma y elimina el primer elemento mas bajo o nulo si esta vacio
		System.out.println(s.pollFirst());
		
		//obtiene y elimina el ultimo elemento
		System.out.println(s.pollLast());
		
		//Muestra los valores de manera descendente
		System.out.println(s.descendingSet());
	}

}
