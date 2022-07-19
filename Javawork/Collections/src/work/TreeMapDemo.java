package work;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<>();
		
		tm.put("Hola", "a");
		tm.put("Holi", "i");
		tm.put("Hole", "e");
		tm.put("Holu", "u");
		
		System.out.println(tm);
		
		System.out.println(tm.floorKey("Hole"));
		System.out.println(tm.lowerKey("Holu"));
		System.out.println(tm.ceilingKey("Hola"));
		System.out.println(tm.higherKey("Hola"));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.descendingMap());
		
		
	}

}
