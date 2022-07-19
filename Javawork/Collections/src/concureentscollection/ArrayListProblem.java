package concureentscollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem extends Thread{
	static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.add("Kubernetes");
	}
	

	public static void main(String[] args) {
		ArrayListProblem arl= new ArrayListProblem();
		arl.start();
		
		courses.add("Java");
		courses.add("AWS");
		courses.add("Python");
		courses.add("Docker");

		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			if (course.equals("Docker")) {
				courses.remove(course);// elimina un curso
			}

		}

	}

}
