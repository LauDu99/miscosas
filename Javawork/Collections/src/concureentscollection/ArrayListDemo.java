package concureentscollection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <Integer> lis = new ArrayList<>();
		lis.add(new Integer(20));
		lis.add(10);
		lis.add(30);
		
		Iterator<Integer> itr = lis.iterator();
		
		while(itr.hasNext()) {//imprime los valores analiza si existe y si si continua
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(lis);
		
	}

}
