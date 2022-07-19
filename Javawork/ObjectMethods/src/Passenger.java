
public class Passenger {
	private int id;
	private String firstName;
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override//sobre escribir el objeto que ya existe
	public String toString() {
		return "Passenger information: "+this.firstName+this.lastName; 
	}
	
	@Override
	public int hashCode() {//puedes asignar tus propios valores al hashcode
		return id+firstName.length()+lastName.length();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Passenger ps = (Passenger) obj;
		if(ps.getId()==this.id && ps.getFirstName().equals(this.firstName)&& ps.getLastName().equals(this.lastName)) {
			return true;
		}
		return false;
	}
	
}
