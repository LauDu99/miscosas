package com.laura.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.laura.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/laura/spring/springaop/test/config.xml");
		ProductService productservice = (ProductService) context.getBean("productService");
		System.out.println(productservice.multiply(4, 5));
	}

}
