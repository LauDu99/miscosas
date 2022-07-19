import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "You are the creator of your destiny";
		
		StringTokenizer st = new StringTokenizer(s);//se puede cambiar por comas o depende la cadena 
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
