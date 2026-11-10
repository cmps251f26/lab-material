package exercise1;

public class Account {
	private String name;
	private double balance;

	public Account(String name) {
		this.name = name;
	}

	public Account(String name, double balance) {
		this.name = name;
		setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0)
			this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance)
			System.out.println("withdrawal amount exceeded account balance");
		else if (amount > 0)
			balance -= amount;
	}
}
