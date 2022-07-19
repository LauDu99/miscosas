
public class Test {

	public static void main(String[] args) {
		Passenger ps = new Passenger();
		ps.setFirstName("Laura");
		ps.setLastName("Duran");
		ps.setId(123);
		
		Passenger ps2 = new Passenger();
		ps2.setFirstName("Laura");
		ps2.setLastName("Duran");
		ps2.setId(123);
		
		//comparando si ps y ps2 contenido es igual con el overriding de passenger
		System.out.println(ps.equals(ps2));
//		System.out.println(ps.hashCode());
	}

}
