package com.laura.inheritance;

public class Test {
	
	public static void main(String[] args) {
		String[] projects = new String[] {"Flight Reservation", "Check in"};
		Manager manager = new Manager(1, "John", "Traveler", 10000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		Developer developer = new Developer(2,"Laura", "Travel",20000, "Full Stack");
		developer.work();
	}
}
