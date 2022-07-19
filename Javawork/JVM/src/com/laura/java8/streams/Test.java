package com.laura.java8.streams;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
	
		Class c = Class.forName("User");
		//obteniendo los metodos declarados en la clase 
		Method[] methods = c.getDeclaredMethods();
		
		//obteniendo metodos 
		for(Method method : methods) {
			System.out.println(method.getName());
		}
		//devuelve cuantos metodos uttilizaos hay en la clase
		System.out.println(methods.length);
	}

}
