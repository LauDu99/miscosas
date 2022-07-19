package collectionutil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		System.out.println(l);
		
		Collections.sort(l, new MyComparator());//Invierte los valores
		
		System.out.println(l);
		int result = Collections.binarySearch(l, "C");
		//Dice en que posiicion esta y si no existe donde iria
		System.out.println("Esta en la posición: ");
		
		//Muestra los datos al reves
		Collections.reverse(l);
		
	}

}
