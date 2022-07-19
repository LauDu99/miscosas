
public class Test {
	
	static ArrayIndexOOBDemo a;
	
	public static void main(String[] args) {
		try {
			Test.a.method1();
		}catch(NullPointerException e) {
			System.out.println("Cree la instancia de Test");
		}
		
	
	}
}
