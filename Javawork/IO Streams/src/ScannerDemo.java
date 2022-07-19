import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese, id, nombre y puntaje");

		int id = scanner.nextInt();
		String name = scanner.next();
		double score = scanner.nextDouble();

		System.out.println("Student Details");
		System.out.println("Id: " + id);
		System.out.println("NAme: " + name);
		System.out.println("Score: " + score);

	}

}
