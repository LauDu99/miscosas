package com.laura.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/reftypes/config.xml");
		Student student = (Student) ctx.getBean("Student");
		System.out.println(student);

	}

}
