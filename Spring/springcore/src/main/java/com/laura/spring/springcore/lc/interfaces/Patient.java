package com.laura.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void hi() {
		System.out.println("inside hi method");
	}

	public void bye() {
		System.out.println("inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterpropoerties set");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Insidee destroy");
	}

}
