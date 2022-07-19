
public class Myinmutables {

	int x;
	
	Myinmutables(int x){
		this.x=x;
	}
	
	public Myinmutables change(int x) {
		if(this.x==x) {
			return this;
		}else {
			return new Myinmutables(x);
		}
	}
	public static void main(String[] args) {
		Myinmutables m1 = new Myinmutables(20);
		Myinmutables m2 = m1.change(20);
		System.out.println(m1==m2);
		Myinmutables m3 = m2.change(30);
		System.out.println(m3==m2);
	}

}
