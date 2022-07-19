package com.laura.overriding;

public class Overriding {

	public static void main(String[] args) {
		Parent.doSomething();
		Child.doSomething();
		
		Parent p = new Parent();
		System.out.println(p.s);
		
		Child ch = new Child();
		System.out.println(ch.s);
		
		Parent c1 = new Child();
		System.out.println(c1.s);
	}

}
