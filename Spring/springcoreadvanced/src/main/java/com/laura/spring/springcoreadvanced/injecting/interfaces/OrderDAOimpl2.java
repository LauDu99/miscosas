package com.laura.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOimpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOimpl2");
	}

}
