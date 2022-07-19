package com.laura.trainings;

import java.util.concurrent.Callable;
//Clase tipo thread que implementa la interfaz callable
public class MyCallable implements Callable<Integer> {

	int num;

	public MyCallable(int num) {//constructor
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is the sum of all the numbers up to" + num);
		int sum=0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}
