package com.laura.java1314;

public class RecordDemo {

	//usando record y creando el constructor no necesitas crear la clase
	//record Employee(String name, int sal) {}
	
	public static void main(String[] args) {

		Employee employee = new Employee("John", 100);
		System.out.println(employee);
		
		
		
	}

}
