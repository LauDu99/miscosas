package com.laura.inheritance;

public class Tester extends Employee {
	
	String [] tools;//array porque puede tener muchos proyectos
	
	public Tester(int id, String name, String dept, double salary, String [] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}

	protected void work(){
		super.work();
		System.out.println("Tester is testing"+ tools);
		for(int i=0; i<tools.length;i++) {
			System.out.println(tools[i]);
		}
	}
}
