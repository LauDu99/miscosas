package bonusprogram;

import java.util.HashMap;

public class CharCounter {

	public static void main(String[] args) {

		String s = "Im the creator of my desstiny";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		// mientras que i sea menor a la cantidad de caracteres
		while (i < s.length()) {
			// da el caracter actual del mapa
			char currentChar = s.charAt(i);
			// analiza si la lista ya tiene la letra si no lo crea con 1 si si le suma 1
			if (map.containsKey(currentChar)) {
				map.put(currentChar, map.get(currentChar) + 1);
			} else {
				map.put(currentChar, 1);
			}
			i++;
		}
		System.out.println(map);
	}

}
