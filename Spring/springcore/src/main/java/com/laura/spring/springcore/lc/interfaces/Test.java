package com.laura.spring.springcore.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/lc/interfaces/config.xml");
		Patient patient = (Patient) ctx.getBean("Patient");
		System.out.println(patient);
		//para que muestre el destroy method
		ctx.registerShutdownHook();

	}

}
