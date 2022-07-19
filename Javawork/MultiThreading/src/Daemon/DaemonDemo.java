package Daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThread mt = new MyThread();
		System.out.println(mt.isDaemon());//haciendo un hilo daemon
		mt.start();
	}

}
