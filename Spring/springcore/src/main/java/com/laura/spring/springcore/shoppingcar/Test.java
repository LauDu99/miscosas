package com.laura.spring.springcore.shoppingcar;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/shoppingcar/config.xml");
		ShoppingCar sc = (ShoppingCar) ctx.getBean("ShoppingCar");
		System.out.println(sc);

	}

}
