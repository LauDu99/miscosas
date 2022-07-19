package com.laura.trainings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {//creamos la matriz de tareas 
		CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };
		
		ExecutorService service = Executors.newFixedThreadPool(2);//LE asigna de 2 grupos de subproceso
		
		for(CheckProcessorTask checkProcessorTask :cps) {
			service.submit(checkProcessorTask);
		}
		
		service.shutdown();//Para cerrar el ejecutor cuando acabe
	}

}
