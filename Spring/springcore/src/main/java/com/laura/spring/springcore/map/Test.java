package com.laura.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/map/config.xml");
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
		
	}

}
