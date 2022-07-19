package comparator;

import java.util.Set;
import java.util.TreeSet;

public class StringThreeSet {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet(new StringComparator());//Ordena de manera alfabetica
		
		set.add("abcxyz");
		set.add("xyzdefas");
		set.add("def");
		
		for(String obj :set) {
			System.out.println(obj);
		}
	}

}
