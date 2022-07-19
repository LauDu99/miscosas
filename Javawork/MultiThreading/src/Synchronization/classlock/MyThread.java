package Synchronization.classlock;

public class MyThread extends Thread{

	
	String name;

		MyThread(String name){
			this.name= name;
		}
		
		public void run() {
			DisplayMessage.sayHello(name);//llamar metodos estaticos, cuando no son estaticos se crea una instancia
		}
		
}
