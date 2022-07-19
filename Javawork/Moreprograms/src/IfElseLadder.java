
public class IfElseLadder {

	public static void main(String[] args) {
		
		String choice="Check balance";
		
		if(choice.equals("Check balance")){//Mostrar lo que el usuario requiere
		System.out.println("Check balance");
	}else if(choice.equals("Change Pin")) {
		System.out.println("Change Pin");
	}else if(choice.equals("Withdraw Cash")) {
		System.out.println("Withdraw Cash");
	}else if(choice.equals("Deposit check")) {
		System.out.println("Deposit check");
}
}
}