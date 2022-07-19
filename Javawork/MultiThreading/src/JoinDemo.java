import java.util.Scanner;

public class JoinDemo extends Thread {
	static int num, sum = 0;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();// mostrar el tiempo real

		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.num = scanner.nextInt();

		JoinDemo jd = new JoinDemo();// Siempre crear la instancia de cualquier metodo o de la clase!!!
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Sum of first numbers of " + JoinDemo.num + " Is " + JoinDemo.sum);
		long end = System.currentTimeMillis();

		System.out.println("The total time taken: " + (end - start)/1000 + " seconds");

	}

	public void run() {
		for (int i = 1; i <= JoinDemo.num; i++) {
			JoinDemo.sum = i + JoinDemo.sum;
			// JoinDemo.sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
