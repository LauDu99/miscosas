
public class MultiThreaded extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("mt");
		mt.start();//para iniciar run siempre start
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("mt1");
		mt1.start();
		
		/*Thread currentThread = Thread.currentThread();
		System.out.println("Thread Name is "+ currentThread.getName());//saber el nombre del hilo
		
		/*for (int j = 0; j <= 200; j++) {
			System.out.print("j: " + j + "\t");
			Thread.sleep(1000);
		}*/
	}
	
	public void run() {// run es para multi tareas
		
		System.out.println("The current name is: "+ Thread.currentThread().getName());
		
		/*Thread currentThread = Thread.currentThread();
		currentThread.setName("Print 200 numbers"); Darle un nombre al hilo
		System.out.println("Thread Name is " + currentThread.getName());
		
		/*for (int i = 0; i <= 200; i++) {
			System.out.print("i: " + i + "\t");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread exiting");
		}
		*/
	}
}
