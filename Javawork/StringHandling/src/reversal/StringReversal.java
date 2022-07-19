package reversal;

public class StringReversal {
//muestra una cadena al reves
	public String firstway(String actual) {
		String reverse = "";
		for(int i =actual.length();i>0; i--) {
			reverse= reverse+actual.charAt(i-1);
		}
		return reverse;
	}
	
	public String secondWay(String actual) {
		byte[] s1 = actual.getBytes();//obtiene los bytes de la cadena
		byte[] s2 = new byte[s1.length];//crea la matriz en blanco que guardara lo obtenido
		
		for(int i =0; i<s1.length; i++) {
			s2[i] = s1[s1.length-i-1];//la recorre de manera inversa la cadena
		}
		
		String reversed = new String(s2);//creas otra cadena que regrese el nombre inverso
		
		return reversed;
		
	}
	public static void main(String[] args) {
		String str ="Laura";
		StringReversal sr = new StringReversal();
		System.out.println(sr.firstway(str));
		
		
	}

}
