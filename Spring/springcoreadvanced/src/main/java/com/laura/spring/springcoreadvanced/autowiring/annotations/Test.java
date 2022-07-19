package com.laura.spring.springcoreadvanced.autowiring.annotations;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/laura/spring/springcoreadvanced/autowiring/annotations/config.xml");
		Employee employee = (Employee) ctx.getBean("Employee");
		System.out.println(employee);
	}
}
