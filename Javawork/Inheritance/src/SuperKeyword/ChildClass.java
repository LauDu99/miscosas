package SuperKeyword;

public class ChildClass extends Superclass {
	
	ChildClass(){
		this(10);
		System.out.println("No args child class constructor");
	}
	
	ChildClass(int x){
		super(x);
		System.out.println("No args child class constructor");
	}
	
	public static void main(String[] args) {
		ChildClass child = new ChildClass();
	}
}
