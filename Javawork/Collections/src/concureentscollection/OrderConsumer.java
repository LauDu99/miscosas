package concureentscollection;

import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

	private BlockingQueue<String> queue;
	
	public OrderConsumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		try {
			queue.put("Mac");//creando un producto en la cola
			queue.put("DELL");
			queue.put("Iphone");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
