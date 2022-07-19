
public class StringParser {
	public static void main(String[] args) {
		String s ="abc";
		try {
		int m = Integer.parseInt(s);
		System.out.println(m);
		}catch(NumberFormatException e) {
			System.out.println("Ingrese numeros");
		}
	}
}
