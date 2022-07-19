
public class Test {

	public static void main(String[] args) {
		//aplicando lambda
		A a = ()->System.out.println("Inside my method");
		a.myMethod();
	}

}
