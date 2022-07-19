package com.laura.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/dependencycheck/config.xml");
		Prescription ps = (Prescription) ctx.getBean("Prescription");
		System.out.println(ps);

	}

}
