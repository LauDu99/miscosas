import java.util.ArrayList;
import java.util.List;

public class B {

	//anular el metodo deprecated, cualquier tipo de error 
	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {
		A a = new A();
		a.b=10;
		System.out.println(a);
		a.mymethod();
		
	List list = new ArrayList();
	System.out.println(list);
	}

}
