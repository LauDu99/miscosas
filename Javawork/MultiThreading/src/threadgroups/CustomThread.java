package threadgroups;

public class CustomThread extends Thread{

	CustomThread(ThreadGroup g, String name){//necesitamos crear el constructor siempre 
		super(g,name);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
