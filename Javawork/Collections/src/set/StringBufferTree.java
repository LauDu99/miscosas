package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.SBComparator;

public class StringBufferTree {

	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());// Ordena de manera alfabetica

		set.add(new StringBuffer("abcxyz"));
		set.add(new StringBuffer("xyzabcdd"));
		set.add(new StringBuffer("def"));

		for (StringBuffer obj : set) {
			System.out.println(obj);
		}
	}

}
