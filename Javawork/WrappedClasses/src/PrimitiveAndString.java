
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x =100;
		
		String s = Byte.toString(x);//De primitivo a cadena
			byte y =Byte.parseByte(s);//De cadena a byte
	}

}
