import java.util.Optional;

public class OptionalUpdates {

	public static void main(String[] args) {

		//sirve para saber si algo está vacio o no
		Optional<String> str = Optional.of("test");
		Optional<String> str2 = Optional.empty();
		System.out.println(str.isEmpty());
	}

}
