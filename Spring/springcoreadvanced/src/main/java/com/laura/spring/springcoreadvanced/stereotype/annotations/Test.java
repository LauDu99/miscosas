package com.laura.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instructor");
		System.out.println(instructor);
	}
}
