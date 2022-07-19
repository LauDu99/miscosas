package nonstaticinner;

public class Outer {

	private static int x = 50;
	private int y;

	Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer classes non static method");
	}

	class Inner {// no podemos definir metodos staticos aki

		private int y;

		Inner(int y) {
			this.y = y;
		}

		private void f2() {
			System.out.println("Outr clases x " + Outer.x);
			System.out.println("Outer classes y " + Outer.this.y);
			System.out.println("Inner clasees y " + this.y);
			//System.out.println("Inner class no satic method");
		}
	}

	public static void main(String[] args) {

		Outer outer = new Outer(80);
		outer.f1();
		Outer.Inner in = outer.new Inner(30);// llamas la clase, la subclase igual a el nombre de la instancia punto new
												// y la clase
		in.f2();
		System.out.println(in.y);
	}

}
