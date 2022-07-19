package com.laura.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/properties/config.xml");
		Languages lgs = (Languages) ctx.getBean("Languages");
		System.out.println(lgs);
		
	}

}
