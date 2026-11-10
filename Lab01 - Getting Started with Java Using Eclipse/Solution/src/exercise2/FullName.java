package exercise2;

import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = cin.next();
		System.out.print("Enter your last name: ");
		String lastName = cin.next();

		String fullName = firstName + " " + lastName;
		System.out.println("Full name: " + fullName);
		cin.close();
	}
}
