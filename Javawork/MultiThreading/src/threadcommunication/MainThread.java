package threadcommunication;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();

		synchronized (t) {
			System.out.println("El hilo principal esperara");
			t.wait();
			System.out.println("Notificar al hilo principal ");
			System.out.println(t.total);

		}
	}
}
