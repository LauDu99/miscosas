import java.lang.Math;
import static java.lang.System.out;
import java.util.Scanner;
import static java.lang.Integer.*;

public class Work {

	public static void main(String[] args) {
		out.println("Enter two numbers:");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = parseInt(scanner.next());
		int num2 = parseInt(scanner.next());
		
		int result= min(num1,num2);
		
		out.println(result);
		
	}

}
