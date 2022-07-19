package com.laura.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/lc/annotations/config.xml");
		Patient patient = (Patient) ctx.getBean("Patient");
		System.out.println(patient);
		//para que muestre el destroy method
		ctx.registerShutdownHook();

	}

}
