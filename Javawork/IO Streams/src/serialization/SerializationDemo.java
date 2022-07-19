package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oop;

		try {
			fos = new FileOutputStream("C:/Users/106721781/Documents/Emp.ser");
			oop = new ObjectOutputStream(fos);// toma el constructor de oop

			Employee emp = new Employee(1, "John", 1000, 12345);
			oop.writeObject(emp);// serializando el objeto conviritendo en una secuencia de bytes
			System.out.println("employee object serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
