package set;

import java.util.Set;
import java.util.TreeSet;

public class StringThreeSet {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet();//Ordena de manera alfabetica
		
		set.add("abc");
		set.add("xyz");
		set.add("def");
		
		for(String obj :set) {
			System.out.println(obj);
		}
	}

}
