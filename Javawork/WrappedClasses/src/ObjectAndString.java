
public class ObjectAndString {

	public static void main(String[] args) {

		long x = 100;
		
		Long y = Long.valueOf(x);//de objeto a string
		
		String s = y.toString();
		
		Long z = Long.valueOf(s);//De cadena a objeto
	}

}
