package Assertions;

public class AssertDemo {
	public static void main(String[] args) {
		
		int withdrawAmount = 100;
		int currentBalance = 60;
		
		assert(withdrawAmount<=currentBalance):"El monto de retiro debe ser menor";
		
	}

}
