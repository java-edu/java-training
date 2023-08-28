
public class Encapsulation {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("Harry", "11111101011", 10000);
		ba.credit(1222);
		System.out.println(ba.getBalance());
		ba.debit(323);
		System.out.println(ba.getBalance());

	}

}

class BankAccount {

	private String name;
	private String accountNumber;
	private double balance;

	public BankAccount() {
	}

	public BankAccount(String name, String accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void credit(double credit) {
		balance = balance + credit;
	}

	public void debit(double debit) {
		balance = balance - debit;
	}

	// setters and getters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

}
