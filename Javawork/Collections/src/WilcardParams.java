import java.util.ArrayList;

public class WilcardParams {
	
	public static void main(String[] args) {
		WilcardParams wcp = new WilcardParams();
		//solo puede extender tipos de la interfaz runable thread 
		wcp.myMethod(new ArrayList<Thread>());
	}
	
	public void myMethod(ArrayList<? extends Thread>l) {
		l.add(null);//no podemos usar add con parametros y usamos extends
		
	}
}
