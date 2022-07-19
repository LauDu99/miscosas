import java.util.Scanner;

public class SumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers to sum");
		while(scanner.hasNextInt());{//sirve para aceptar solo numeros enteros
			int num = scanner.nextInt();
			sum+=num;
		}
		System.out.println("The sum is: "+sum);
	}

}
