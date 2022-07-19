package com.laura.java12.stringapi;

public class StringFeatures {

	public static void main(String[] args) {

		String s = "Soy una persona genial";
		System.out.println(s);
		//sirve para agregar o eliminar espacios
		System.out.println("Antes de la sanngría"+s.indent(5));
		System.out.println("Despues de: "+s.indent(-4));
		
		
		//convertir de cadena a entero 
		String s1= "10";
		
		Integer result = s1.transform(Integer::parseInt);
		System.out.println(result);
		
	}

}
