package com.laura.autowiring.assigment;

import org.springframework.beans.factory.annotation.Autowired;


public class Customer {

	private String name;
	private Reservation Reservation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return Reservation;
	}

	@Autowired
	public void setReservation(Reservation reservation) {
		Reservation = reservation;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", Reservation=" + Reservation + "]";
	}
	
	

}
