package p2;
import p1.*;
import p1.p3.E;

public class C {

	public static void main(String[] args) {
		A.a1();//Accedemos a la clase A del pakete 1 al metodo statico a1
		A aObject = new A();
		aObject.a2();//llama al metdo no statico
		
		E eObject = new E();
		eObject.e1();
		
	}

}
