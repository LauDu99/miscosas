package com.laura.spring.springcore.assigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/laura/spring/springcore/assigment/config.xml");
		University uni = (University) context.getBean("University");
		System.out.println(uni);
	}

}
