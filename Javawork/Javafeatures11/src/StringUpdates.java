import java.util.stream.Collectors;

public class StringUpdates {

	public static void main(String[] args) {

		String  str = "";
		
		System.out.println(str.isBlank());
		//separa por comas donde haya lineas
		str = "I\nam\nthe creator of my destiny";
		System.out.println(str);
		System.out.println(str.lines().collect(Collectors.toList()));
		//es un espacio en blanco
		char c ='\u2000';
		//elimina espacios en blanco
		str.strip();
		//elimina espacios en blanco al inicio
		str.stripLeading();
		//elimina espacios en blanco al final
		str.stripTrailing();
		//repite muchas veces lo que quieras
		System.out.println("-".repeat(100));
		
	}

}
