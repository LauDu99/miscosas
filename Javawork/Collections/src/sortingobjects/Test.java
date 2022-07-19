package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(100,"Luz"));
		set.add(new Employee(400,"Lorena"));
		set.add(new Employee(600,"Lau"));
		set.add(new Employee(500,"Lauri"));
		
		for (Employee employee : set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
		
	}

}
