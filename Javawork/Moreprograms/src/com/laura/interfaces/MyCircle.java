package com.laura.interfaces;

public class MyCircle implements Circle, CircleTwo{

	@Override
	public void calculatedArea() {
		System.out.println(Circle.pi);
	}

	@Override
	public void calculatedArea(float radius) {
		
	}
	

}
