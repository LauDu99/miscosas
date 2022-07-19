package com.laura.java8.streams;

public class MultipleObjects {

	public static void main(String[] args) {
		
		User u1 = new User();
		Class c1 = u1.getClass();
		//creando un usuario para la clase
		User u2 = new User();
		Class c2 = u2.getClass();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		//Comparando si estan en la misma direccion de memoria:
		System.out.println(c1==c2);
		
		//para mostrar que clase carga al usuario
		System.out.println(c1.getClassLoader());
		System.out.println(String.class.getClassLoader());
		
	}

}
