package com.laura.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//le dice al contenedor que cree un objeto
@Component
@Scope("prototype")
public class Instructor {

	// asignar valores con metodos
	// @Value("#{T(java.lang.Math).abs(-99)}")
	// Crear objetos
	// @Value("#{new Integer(88)}")
	// Acceder a valores estaticos
	// @Value("#{T(java.lang.Integer).MIN_VALUE}")
	// asignar cadenas
	// @Value("#{'Laura duran'}")
	// asignar cadenas con ciertos metodos
	// @Value("#{new java.lang.String('Laura Druan')}")
	private int id;
	@Value("Laura")
	private String name;

	@Value("#{topics}")
	private List<String> topics;
	
	@Value("#{2+4>5}")
	//@Value("#{2+4>5?false:true}")
	private boolean active;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}

	

}
