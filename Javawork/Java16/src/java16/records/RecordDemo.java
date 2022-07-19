package java16.records;

public class RecordDemo {

	public static void main(String[] args) {
//podemos usar en clases internas records
		class Inner{
			Product product = new Product("Iphone", "Good", 1001l);

		}
	}

}
