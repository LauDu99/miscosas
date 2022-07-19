package com.laura.autowiring.assigment;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/laura/autowiring/assigment/config.xml");
		Customer customer = (Customer) ctx.getBean("Customer");
		System.out.println(customer);
	}
}
