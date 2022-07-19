package SuperKeyword;

public class Child extends Parent{
	
	int c, d;
	Child(int a, int b, int c, int d){
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void displayDetails() {
		System.out.println("Parent:"+ super.a);
		System.out.println("Parent:"+super.b);
		System.out.println("Childs c:"+this.c);
		System.out.println("Childs d:"+this.d);
	}
	void f1() {
		super.f1();//acceder a metodos del padre desde el hijo
		//opcion de mostrar el padre --> System.out.println(this);
		System.out.println("Inside Child f1");
		
	}
}
