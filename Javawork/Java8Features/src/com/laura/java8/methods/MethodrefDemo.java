package com.laura.java8.methods;

public class MethodrefDemo {

	public static void mymethod() {
		for(int i=0;i<=10;i++);{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		//asignando el metodo estatico a un metodo de interfaces funcionales
		Runnable r = MethodrefDemo::mymethod;
		Thread t = new Thread(r);
		t.start();//siempre usar la variable del hilo
		
		for(int i =0; i<=10;i++) {
			System.out.println("Main thread");
		}
	}

}
