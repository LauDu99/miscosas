
public class Switch {

	public static void main(String[] args) {
		String choice = "Check balance";
		
		switch("Check balance") {
		case "Check balance":
			System.out.println("Check Balance");
			break;
		case "Change Pin":
			System.out.println("Change Pin");
			break;
		case "Withdraw Cash":
			System.out.println("Withdraw Cash");	
			break;
		default:
			System.out.println("Time out");
		}
	}

}
