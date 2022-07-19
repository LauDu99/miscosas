package com.laura.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void hi() {
		System.out.println("inside hi method");
	}

	@PreDestroy
	public void bye() {
		System.out.println("inside bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
