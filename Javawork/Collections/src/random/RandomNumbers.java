package random;

import java.util.Random;

public class RandomNumbers {
//crear numeros random
	public static void main(String[] args) {
		
		Random obj = new Random();
		
		int x = obj.nextInt();
		
		System.out.println("x;" + x);
		
		int y = obj.nextInt(100);
	}

}
