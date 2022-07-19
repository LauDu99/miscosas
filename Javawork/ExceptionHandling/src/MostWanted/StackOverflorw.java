package MostWanted;

public class StackOverflorw {

	public static void method1(){
		System.out.println("method1");
		method2();
	}
	public static void main(String[] args) {
		System.out.println("Method2");
		method1();
	}
	
	public static void method2() {
		System.out.println("method1");
		method1();
	}

}
