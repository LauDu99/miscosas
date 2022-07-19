package synchornization.deadlocks;

public class SecondResource {
	
	public synchronized void method1(FirstResource fr) {
		System.out.println("Inside method 1 SR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking second resource");
		fr.method2();
	}
	public synchronized void method2() {
		System.out.println("Inside method2 of SR");
	}

}
