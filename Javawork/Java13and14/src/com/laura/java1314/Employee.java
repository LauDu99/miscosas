package com.laura.java1314;

public record Employee(String name, int sal) {

	static int id;
	//llamando a la variable estatica
	public static void myMethod() {
		System.out.println(id);
	}
	//llamando metodos no estaticos
	public void myInstanceMethod() {
		System.out.println(this.name);
		System.out.println(this.sal);
	}
	
//	public Employee() {
//		
//	}
//	
//	public Employee(String empData) {
//		this.sal=0;
//		this.name="";
//	}
}
