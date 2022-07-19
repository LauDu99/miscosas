package com.laura.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	public Employee(Address address) {
		this.address = address;
	}

	//hacer la injeccion automaticamente
	@Autowired(required=false)
	//Sirve para señalar como quieres llamare un campo o asignarlo en vez del que ya tiene
	@Qualifier("Address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
