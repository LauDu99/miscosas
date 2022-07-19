package com.laura.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("inside init");
	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}
	//primero creas el objeto y en el servicio lo inyectas para guardarlo
	public void save() {
		dao.create();
	}
}
