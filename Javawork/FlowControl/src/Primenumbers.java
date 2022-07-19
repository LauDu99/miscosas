
public class Primenumbers {

	public static void main(String[] args) {
	
	
	double n=7;
	boolean prime=true;
	
	for(int i=2; i<n-1; i++) {
		if(n%i==0)
		{
			prime=false;
		}else if(prime==true)
		{
			System.out.println(i);
		}else
		{
			System.out.println(i);
		}
	}
	
	}
	
}
