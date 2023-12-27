package bonusprograms;

public class BankAccount {

	static String bankname = "Chase";
	static String bankname1;
	String accountHoldersName;
	String accountNumber;
	float balance;

	public static void main(String[] args) {

		double loanInterestRate = 7.5;

		System.out.println(BankAccount.bankname);
		System.out.println(BankAccount.bankname1);

		BankAccount bankAccount = new BankAccount();
		bankAccount.accountHoldersName = "Praj";
		bankAccount.accountNumber = "123456";
		bankAccount.balance = 57836f;
		System.out.println(bankAccount.balance);
	}

}
