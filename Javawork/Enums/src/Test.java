
public class Test {
	public static void main(String[] args) {
		PaymentType pm= PaymentType.CREDITCARD;//creas la instancia y lo muestras
		System.out.println(pm);
		//crea una matriz con los valores de payment(enum)
		PaymentType[] paymentTypes =  PaymentType.values();//obteniendo los valores
		for(PaymentType paymentType : paymentTypes) {
			System.out.println(paymentType);
			//muestra en que posicion esta en la matriz cada valor de la enum
			System.out.println(paymentType.ordinal());
			
		}
	}
}
