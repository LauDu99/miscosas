
public class BankAccount {
//variables de instancia 
	static  String bankName = "Bank Of America";//son algo unico y comun entre los objetos
	String accountHoldersName;
	String accountNumber;
	float balance;
	
	
	public static void main(String[] args) {
		double loanInterestRate = 7.5;//variable local
		
		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHoldersName = "John";
		bankAccount.accountNumber = "12133";
		bankAccount.balance = 200000f;
		System.out.println(bankAccount.balance);
		
	}

}
