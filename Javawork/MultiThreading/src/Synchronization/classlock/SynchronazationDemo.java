package Synchronization.classlock;

public class SynchronazationDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Steve");
		MyThread t2 = new MyThread("Mark");

		t1.start();
		t2.start();
	}

}
