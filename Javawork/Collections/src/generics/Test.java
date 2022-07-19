package generics;

public class Test {

	public static void main(String[] args) {
		
		MyGenericsClass<String> s = new MyGenericsClass<>("Laura");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericsClass<Integer> in = new MyGenericsClass<>(123);
		in.displayObjectDetails();
		System.out.println(in.getObject());
		
	}

}
