package bonusprogram;

import java.util.ArrayList;

public class DuplicateRemoval {

	public static void main(String[] args) {

		String s = "aaabbcccddzz";
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			char eachChar=s.charAt(i);
			if(!list.contains((eachChar))){
				list.add(eachChar);
			}
		}
		System.out.println(list);
		String result= "";
		for (Character character : list) {
			result+=character;
		}
		System.out.println(result);
	}

}
