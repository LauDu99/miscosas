
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Proccesed Check");
	}
	
	public static void main(String[] args) {
		
		CheckProcessor cp = new CheckProcessor();
		Thread t = new Thread(cp);//le pasas el valor de la clase
		t.start();
	}

}
