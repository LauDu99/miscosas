package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapdemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//Map<String, Integer> map = new LinkedHashMap<>(); ordena los valores por orden de entrada
		//Map<String, Integer> map = new IdentityHashMap<>();//sirve para usar la comparación de localizacion y no de datos
		//Map<String, Integer> map = new WeakHashMap<>();//identifica la recollecion de basura
		
		map.put("John", 70);
		map.put("John", 70);
		map.put("John", 70);
		map.put("John", 70);
		
		Set<String> keySet = map.keySet();//set no repite valores
		System.out.println("Key"+ keySet);
		
		Collection<Integer> values = map.values();//puede repetir valores collection
		System.out.println("Values:"+ values);
		
		for(String key : keySet) {
			System.out.println("Key: "+key+ "Value"+map.get(key));
		}
				
	}

}
