package concureentscollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingqueueTest {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		
		OrderProducer orderProducer = new OrderProducer(queue);//creando la instancia de la clase
		OrderConsumer orderConsumer = new OrderConsumer(queue);

		new Thread(orderProducer).start();//este metodo generara el hilo del productor
		new Thread(orderConsumer).start();
	}

}
