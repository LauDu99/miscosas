package com.laura.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/laura/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) context.getBean("Employee");
		System.out.println(employee);
	}

}
