package com.laura.java1314;

public class NullPointerHelp {

	public static void main(String[] args) {

		String str = null;
		// regresaba que hay en esa posicion
		// -XX:+ShowCodeDetailsInExceptionMessages muestra mas detalles en la consola
		// del error
		System.out.println(str.charAt(1));

	}

}
