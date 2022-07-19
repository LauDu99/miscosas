package Synchronization.blocks;

public class DisplayMessage {
	
	public void sayHello(String name) {

		synchronized (this) {//bloqueo nivel metodo
			for (int i = 0; i <= 10; i++) {
				System.out.println("How are you? " + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
