package com.laura.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Id: "+ emp.getId());
		System.out.println("name: "+ emp.getName());
	}

}
