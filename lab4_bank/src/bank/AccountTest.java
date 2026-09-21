package bank;


public class AccountTest {

	public static void main(String[] args) {
		
		//object instantiation 
		Account account1 = new Account(123, "Ali");
		Account account2 = new Account(124, "Omar");
		Account account3 = new Account(135, "Mohamed");
		
		account1.displayInfo();
		account2.displayInfo();
		account3.displayInfo();
		
		System.out.println(account1.toString());
		System.out.println(account2);
		System.out.println(account3);
		
	}

}
