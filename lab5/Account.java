/*
 * Account
 */

/* Code by Catherine Llanos */

public class Account {
	// 2 private instance variables: accountNumber (int) and balance (double)
	private int accountNumber;
	private double balance;

	// Constructors (overloaded)
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accNum) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	// Getters and Setters for the private instance variables.
	// There is no setter for accountNumber as it is not designed to be changed.

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// public methods credit() and debit(), which adds/subtracts the given amount to/from the balance, respectively
	public void credit(double amount) {
		balance = balance + amount;
	}

	public void debit(double amount) {
		if (balance < amount) {
			System.out.println("amount withdrawn exceeds the current balance!");

		}
	}

	// toString(), which returns "A/C no:xxx, Balance=$xxx.xx", with balance rounded to two decimal places.
	public String toString() {
		return String.format("A/C no:%d, Balance = %.2f", accountNumber, balance);
	}

}
