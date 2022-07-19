package com.laura.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// toma la config del xml
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/laura/spring/springcore/set/setconfig.xml");
		CarDealer cd = (CarDealer) ctx.getBean("cardealer");
		System.out.println(cd.getName());
		System.out.println(cd.getModels());
	}

}
