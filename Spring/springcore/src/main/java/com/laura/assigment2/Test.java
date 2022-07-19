package com.laura.assigment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/laura/assigment2/config.xml");
		MyDAO dao = (MyDAO) context.getBean("MyDAO");
		System.out.println(dao);
		
	}

}
