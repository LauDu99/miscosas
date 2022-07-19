package com.laura.trainings;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) {

		MyCallable[] callables = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60) };//Matriz de llamadas
		
		ExecutorService service  = Executors.newFixedThreadPool(3);//crea un grupo de subprocesos con 3 subprocesos
		
		for (MyCallable myCallable : callables) {//foreach ctrl para crear el bucle
			Future<Integer> future = service.submit(myCallable);//esto nos devuelve el futuro o futura accion
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
	}

}
