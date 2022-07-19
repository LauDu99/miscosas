package Synchronization.blocks;

public class MyThread extends Thread{

	DisplayMessage de;
	String name;

		MyThread(DisplayMessage de, String name){
			this.de = de;
			this.name= name;
		}
		
		public void run() {
			de.sayHello(name);
		}
		
}
