import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;

public class DateFormatTest {
	
	public static void main(String[] args) {
		
		Date d = new Date(0);
		
		//mostrar la fecha de acuerdo al pais
		
		DateFormat usDF = DateFormat.getDateInstance(0,Locale.US);
		DateFormat usUK = DateFormat.getDateInstance(0,Locale.UK);
		
		System.out.println(usDF.format(d));
		System.out.println(usUK.format(d));
		
		
		//obtener la fecha actual en el formato actual con hora
		DateFormat timeinstance = DateFormat.getDateTimeInstance();
		
		System.out.println(timeinstance.format(d));
		
		//obtener la fecha completa 
		DateFormat datetime = DateFormat.getDateTimeInstance(0,0);
		System.out.println(datetime.format(d));
	}

}
