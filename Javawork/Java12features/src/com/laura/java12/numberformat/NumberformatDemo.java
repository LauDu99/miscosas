package com.laura.java12.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberformatDemo {

	public static void main(String[] args) {

		//modificar el pais o tamaño de un numero a su forma abreviada o normal y en que idioma
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(format.format(1000));
		System.out.println(format.format(10000));
	}

}
