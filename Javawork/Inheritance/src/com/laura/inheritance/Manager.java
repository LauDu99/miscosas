package com.laura.inheritance;

public class Manager extends Employee {
	
	String [] projects;//array porque puede tener muchos proyectos
	
	public Manager(int id, String name, String dept, double salary, String [] projects) {
		super(id, name, dept, salary);
		System.out.println("Inside the manager constructor");
		this.projects = projects;
	}
	
	@Override
	protected void work(){
		super.work();
		System.out.println("Manager is working");
		for(int i=0; i<projects.length;i++) {
			System.out.println(projects[i]);
		}
	}

}
