package localinner;

public class Outer {
	
	void f1() {
		System.out.println("Inside outers f1");
		
		class localInner {
			void f2() {
				System.out.println("Inside local Inners f2");
			}
		}
		localInner inner = new localInner();
		inner.f2();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();
	}

}
