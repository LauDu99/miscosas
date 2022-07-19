
public abstract class BMW {

	void commonFun() {
		System.out.println("inside common function");
	}
	
	abstract void accelerate();
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}
}
