package exercise1;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Sara");
		System.out.println("Name: " + account1.getName());
		System.out.println("Balance: " + account1.getBalance());

		Account account2 = new Account("Khalid", -50); // negative balance is ignored, stays 0.0
		System.out.printf("%s's balance: %.2f%n", account2.getName(), account2.getBalance());

		account2.deposit(200);
		account2.deposit(-30);
		System.out.printf("After depositing 200 (and trying -30): %.2f%n", account2.getBalance());

		account2.withdraw(500);
		System.out.printf("After trying to withdraw 500: %.2f%n", account2.getBalance());

		account2.withdraw(75);
		System.out.printf("After withdrawing 75: %.2f%n", account2.getBalance());
	}
}
