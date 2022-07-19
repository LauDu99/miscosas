package SuperKeyword;

public class Superclass {
	int x;
	public Superclass() {
		System.out.println("No args superclass constructor");
	}
	
	public Superclass(int x) {
		this();
		this.x=x;
		System.out.println("args superclass constructor");
	}
}
