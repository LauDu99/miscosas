package sortingobjects;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	
	Employee(int id, String name){
		this.id= id;
		this.name = name;

	}

	@Override
	//para cadenas usar compareTo
	public int compareTo(Employee o) {
		int id = this.id;
		int id2 = o.id;
		if(id>id2) {
			return 1;
		}else if(id<id2) {
			return -1;
		}else 
		return 0;//son iguales
	}

}
