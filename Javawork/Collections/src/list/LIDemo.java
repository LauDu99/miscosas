package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIDemo {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList();//cuando se crea la lista es new
		
		list.add("abc");
		list.add("xyz");
		list.add("def");
		
		ListIterator<String> itr = list.listIterator();//con iterator es list.iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());//recorre solamente
		}
		
		System.out.println("Lista normal");
		
		while(itr.hasPrevious()) {//sirve para invertir el orden
			System.out.println("Inversa:"+ itr.previous());
		}
	}

}
