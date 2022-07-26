import java.util.Locale;

public class LocalTest {

	public static void main(String[] args) {

		// para obtener la region y el idioma
		Locale l = Locale.getDefault();

		// da el nombre abreviado de la region e idioma
		System.out.println(l.getCountry() + " " + l.getLanguage());

		// da el nombre completo del idioma y pa�s
		System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());

		// agregar un idioma mas o cambiarlo
		Locale.setDefault(Locale.UK);

		// Matriz de todos los paises que hay
		String[] s = Locale.getISOCountries();

		for (String eachcountry : s) {
			System.out.println(eachcountry);

		}
		
		//matriz de todos los idiomas k hay

		String[] languages = Locale.getISOCountries();

		for (String eachlanguages : languages) {
			System.out.println(eachlanguages);

		}

	}

}
