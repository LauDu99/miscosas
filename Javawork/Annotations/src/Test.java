import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// cargando una clase
		try {
			// obteniendo el nombre y contructores de la clase
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor<?>[] constructor = myClass.getConstructors();
			System.out.println(Arrays.toString(constructor));
			// obteniendo metodos
			System.out.println(Arrays.toString(myClass.getMethods()));

			// obteniendo el constructor predeterminado
			Constructor<?> constructors = myClass.getConstructor(null);
			//creando la instancia del objeto
			System.out.println(constructors.newInstance(null));

			// creando una instancia junto con el contructor con valores definidos
			Constructor<?> constructors2 = myClass.getConstructor(double.class, double.class);

			// asignando los valores a las variables
			Object myObj = constructors2.newInstance(5, 10);

			// se invocan primero los setters
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myObj, 6);

			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myObj, 8);
			
			//hacer publico el acceso
			Field num1field = myClass.getDeclaredField("num1");
			num1field.setAccessible(true);
			
			num1field.set(myObj, 70);
			
			
			// obteniendo el get de num1
			Method method = myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));

			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));
			
//			Method sum = myClass.getMethod("sum", int.class, int.class);
//			System.out.println(sum.invoke(myObj, 3, 6));
			
			
			//muestra todas las annotations de la clase
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			
			//acceder a los metodos y puedes cambiar a ser de un tipo especifico
			MyAnnotation annotation = (MyAnnotation) annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
