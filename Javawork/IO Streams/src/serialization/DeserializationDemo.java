package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:/Users/106721781/Documents/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();//metodo para volver a leer el objeto, creandolo uno
		Employee emp = (Employee)obj;
		
		System.out.println("Employee id: "+emp.id);
		System.out.println("Employee id: "+emp.name);
		System.out.println("Employee id: "+emp.salary);
	}

}
