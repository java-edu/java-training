
public class GenericsExample {

	public static void main(String[] args) {

//		BankAccount a = new BankAccount();
//		a.balance = 12;
//		System.out.println(a.balance);
//		a.balance = "12";
//		System.out.println(a.balance);

		BankAccount<String> b = new BankAccount();
//		b.balance = 123;
		b.balance = "12313";
		credit(b, 100);
		System.out.println(b.balance);

	}

	static void credit(BankAccount<String> b, int value) {
		b.balance = "" + Integer.valueOf(b.balance) + value;
	}

}

class BankAccount<T> {

	T balance;

}
