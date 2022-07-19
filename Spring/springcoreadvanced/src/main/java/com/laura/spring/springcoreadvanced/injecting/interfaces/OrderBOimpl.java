package com.laura.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBOimpl implements OrderBO {

	@Autowired
	@Qualifier("dao")
	private OrderDAO doo;

	@Override
	public void placeOrder() {
		System.out.println("Inside order Bo");
		doo.createOrder();
	}

	public OrderDAO getDoo() {
		return doo;
	}

	public void setDoo(OrderDAO doo) {
		this.doo = doo;
	}

}
