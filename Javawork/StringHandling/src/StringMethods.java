
public class StringMethods {

	public static void main(String[] args) {
		String s ="Hello World";
		
		System.out.println(s.length());//la longitud de la palabra
		System.out.println(s.indexOf('o'));//En que numero se encuentra cierto caracter de la cadena
		System.out.println("ChaAt:"+ s.charAt(3));//Que letra o caracter hay en la posicion 3
		
		
		System.out.println("substring con el indice inicial"+ s.substring(2));
		System.out.println("substring con indice inicial y final"+s.substring(0, 4));//no empieza en 0
	
		String[] result = s.split(" ");//Para dividir en la matriz
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("replace: "+s.replace("l", "k"));
		System.out.println("toUpperCase: "+ s.toUpperCase());
		System.out.println("toUpperCase: "+ s.toLowerCase());
		
	}

}
