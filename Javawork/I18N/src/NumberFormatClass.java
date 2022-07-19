import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass {

	public static void main(String[] args) {
		double d = 12344444.3;
		//obtener una cantidad en cierto idioma
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		//cambiar la cantidad de decimales 
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(6);
		
		System.out.println(nf.format(d));
		//cambiar los numeros del entero
		nf.setMaximumIntegerDigits(4);
		
		long l= 1234567655;
		
		NumberFormat nf2= NumberFormat.getInstance(Locale.US);
		
		NumberFormat nf3 = NumberFormat.getInstance(Locale.UK);
		
		System.out.println(nf2.format(l));
		System.out.println(nf3.format(l));
	}

}
