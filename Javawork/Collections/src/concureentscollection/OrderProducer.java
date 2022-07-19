package concureentscollection;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		
		try {
			System.out.println(queue.take());//hace que espere si hay algo en la cola
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
