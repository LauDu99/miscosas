package com.laura.java.re;

import java.util.regex.Pattern;

public class Character {

	public static void main(String[] args) {
		//con ? es 0 o 1 vez
		//cualquiera puede sr a o b o c o muchas veces cualquiera de esos
		System.out.println(Pattern.matches("[abc]*", "a"));
		
		//cualquier digito
		System.out.println(Pattern.matches("\\d", "1"));
		
		//cualquiera menos un digito
		System.out.println(Pattern.matches("\\D", "a"));
		//de la a a la z en mayus o minus minimo2 maximo 5
		System.out.println(Pattern.matches("[a-zA-Z]{2,5}", "te"));
		
	}

}