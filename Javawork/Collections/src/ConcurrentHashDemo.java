import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentHashDemo extends Thread{
	static ConcurrentHashMap<String,String> courseRating = new ConcurrentHashMap<String, String>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courseRating.put("Kubernetes", "4.0");
	}
	

	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashDemo arl= new ConcurrentHashDemo();
		arl.start();
		
		courseRating.put("Java","5.0");
		courseRating.put("AWS","4.3");
		courseRating.put("Python","3.8");
		courseRating.put("Docker", "4.9");

		Iterator<String> iterator = courseRating.keySet().iterator();
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = iterator.next();
			System.out.println(courseRating.get(course));//obteniendo solo los valors
			if (course.equals("Docker")) {
				courseRating.remove(course);// elimina un curso
			}

		}

	}

}
