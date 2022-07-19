package Work;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println();
		}
		
	}

}
