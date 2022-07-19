package staticinner;

public class Outer {

	static void f1() {//
		System.out.println("Outer the static method");
	}

	static class Inner {// declarando una clase statica interna
		
		static void f2() {// miembro estatico
			System.out.println("Inside the inner static method");
		}

		void f3() {
			System.out.println("Non static method");
		}
		
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();// usar clase externa, clase interna y el metodo
		
		Outer.Inner inner = new Outer.Inner();//para llamar el metodo no statico se crea la instancia
		
		inner.f3();
	
	}

}
