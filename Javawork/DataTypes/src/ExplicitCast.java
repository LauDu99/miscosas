
public class ExplicitCast {

	public static void main(String[] args) {
		int i= 100;
		byte b = (byte)i;
		
		int x = 97;//De peque�o a grande es implicito, de grande a peque�o explicito 
		char ch = (char) x;
		System.out.println(ch);
		
		int y = 130;
		
		byte z = (byte)y;
		System.out.println(z);
		
		int m = 612;
		byte n = (byte)m;
		char o = (char)n;
		System.out.println(o);
	}

}
