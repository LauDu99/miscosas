package Work;

public class EvenNumbers extends Thread {// pares del 0 al 10

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}

			}
		}
	}
}
