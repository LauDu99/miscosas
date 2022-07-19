
public class CompileTimeBinding {
	
	void add(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	void add(float a, float b) {
		float result = a+b;
		System.out.println(result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println(result);
	}
	public static void main(String[] args) {
		CompileTimeBinding obj = new CompileTimeBinding();//para metodos no estaticos tienes que crear una instancia de la clase
		obj.add(3, 4);
		obj.add(30f, 40f);
		obj.add(20, 30, 40);
	}
}
