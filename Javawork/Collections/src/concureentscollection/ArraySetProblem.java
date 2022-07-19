package concureentscollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ArraySetProblem extends Thread{
	static CopyOnWriteArraySet<String> courses = new CopyOnWriteArraySet<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}
	

	public static void main(String[] args) throws InterruptedException {
		ArraySetProblem arl= new ArraySetProblem();
		arl.start();
		
		courses.add("Java");
		courses.add("AWS");
		courses.add("Python");
		courses.add("Docker");

		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = iterator.next();
			System.out.println(course);
			if (course.equals("Docker")) {
				courses.remove(course);// elimina un curso
			}

		}

	}

}
