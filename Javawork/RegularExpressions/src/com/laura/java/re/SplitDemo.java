package com.laura.java.re;

public class SplitDemo {

	public static void main(String[] args) {
	//Separar ya sea por espacios puntos o comas
		String s = "www.laura.com";
		
		String[] words = s.split("[.]");
		for(String word:words) {
			System.out.println(word);
		}
	}

}
