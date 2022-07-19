package com.laura.java8.features.lambdas;

public class Test {
	public static void main(String[] args) {
		//Implementando la clase con runable
		//Runnable r = new MyRunnable();
		//implementando el multiproceso
		//Thread t = new Thread(r);
		//t.start();
		
		//lambda
		Runnable r = ()->{
			for(int i=1; i<=10; i++)
			{
				System.out.println("Child Thread");
			}
		};
		
		for(int i=1; i<=10; i++) {
			System.out.println("Main Thread");
		}
		Thread t = new Thread(r);
		t.start();
	}

}

