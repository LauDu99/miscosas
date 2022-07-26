package com.laura.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.laura.spring.springorm.product.dao.ProductDao;
import com.laura.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/laura/spring/springorm/product/test/config2.xml");
		ProductDao pd = (ProductDao) context.getBean("productDao");
		Product product = new Product();
		product.setId(1);
		product.setName("iphone");
		product.setDesc("Awesome");
		product.setPrice(700);
		pd.create(product);

	}

}
