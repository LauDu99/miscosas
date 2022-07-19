package inmutable;

public class Tests {
	public static void main(String[] args) {
		User user = new User(1, "John");
		System.out.println(user);//Es mutable

		String s = new String("Laura");
		System.out.println(s);
		
		Integer i = new Integer(30);//muestra el valor porque es inmutable sus valores no cambian
		System.out.println(i);
	}
}
