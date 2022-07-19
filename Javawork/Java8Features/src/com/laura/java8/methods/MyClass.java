package com.laura.java8.methods;

public class MyClass {

	
	public void mymethod2(int i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		MyInterface f = i->System.out.println(i);
		f.mymethod(10);
		
		MyClass c = new MyClass();
		MyInterface f1 = c::mymethod2;
		f1.mymethod(20);
		
	}

}
