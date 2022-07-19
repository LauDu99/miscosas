import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Student s1 = new Student();
		//Class.forName("defaul package").newInstance();
		//clona el objeto
		//diferente manera de crear el objeto y usar reflexion
		Student s2 = Student.class.getConstructor().newInstance();
		Student s3 = (Student) s1.clone();
		
		DateFormat dateformat = DateFormat.getInstance();
	}

}
