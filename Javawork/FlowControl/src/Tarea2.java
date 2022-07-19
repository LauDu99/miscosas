import java.util.Scanner;
public class Tarea2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un numero:");
		num= reader.nextInt();
		for(int i=100; i>num;i--) {
			if (i % 10 == 0) {
				continue;
			}
			System.out.println(i);
	}
}
}
