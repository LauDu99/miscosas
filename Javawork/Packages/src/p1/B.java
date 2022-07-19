package p1;
import p1.A.*;
import p1.p3.E;
public class B {

	public static void main(String[] args) {
		
		A.a1();
		
		A aObject = new A();//necesitamos crear el objecto para no estatico
		aObject.a2(); //nombre del objeto mas nombre del metodo
		
		E eObject = new E();
		eObject.e1();
	}

}
