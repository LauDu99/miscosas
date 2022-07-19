package Work;

public class MainThread {
	
	public static void main(String[] args) {
		
		OddNumbers on = new OddNumbers();
		EvenNumbers en = new EvenNumbers();
		on.start();
		en.start();
	}

}
