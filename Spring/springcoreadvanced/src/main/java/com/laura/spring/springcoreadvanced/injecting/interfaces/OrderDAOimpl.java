package com.laura.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOimpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Inside order DAO");
	}

}
