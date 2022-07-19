
public enum PaymentType {
	CREDITCARD(5), CASH(10), PAYPAL(10);
	//asignar valores a las constantes
	int fee;
	private PaymentType(int fee) {
		this.fee = fee;
	}
}
