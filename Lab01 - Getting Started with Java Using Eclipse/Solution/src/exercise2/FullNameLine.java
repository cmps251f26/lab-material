package exercise2;

import java.util.Scanner;

// Same as FullName, but nextLine() reads the whole line, spaces included
public class FullNameLine {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String fullName = cin.nextLine();

		System.out.println("Full name: " + fullName);
		cin.close();
	}
}
