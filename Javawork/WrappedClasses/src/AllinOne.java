
public class AllinOne {

	public static void main(String[] args) {
		
	int x = 100;
	
	String y = Integer.toString(x); //Primitivo a cadena

	Integer b = new Integer(y); //De primitivo a objeto
	
	int z = b.intValue(); //De objeto a primitivo
	
	
	Integer c = new Integer(z); //De primitivo a objeto 
	
	String d = c.toString(); //de objeto a cadena
	
	int e = Integer.parseInt(d); //cadena a primitivo
	
	}

}
