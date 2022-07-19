package Work;

public class TestEncapsulation {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId(123l);
		p.setName("Laura");
		p.setSsn("123ll");
		
		System.out.println("Id: "+ p.getId());
		System.out.println("Name: "+ p.getName());
		System.out.println("SSN: "+ p.getSsn());
	}
}
