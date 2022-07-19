import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int a, b, c;
		
		try {
		System.out.println("Ingrese 2 numeros");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c= a/b;
		System.out.println("LA division es: "+ c);
		}catch(ArithmeticException e) {
			System.out.println("No ingrese 0");
		}finally {//Siempre se ejectuta sin importar si hay o no excepcion
			System.out.println("Finally");
		}
	}
}
