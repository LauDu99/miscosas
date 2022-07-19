package MostWanted;

public class IlegalArgumentDemo {

	public int sum(int a, int b) {
		if(a==0 || b ==0) {
			throw new IllegalArgumentException("a and b should not be zero");
		}
		return a + b;
	}
	public static void main(String[] args) {
		Thread tr = new Thread();
		tr.setPriority(10);//el rango es de 1 a 10
	}

}
