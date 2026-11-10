package exercise5;

import java.util.Scanner;

public class FourEqual {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = input.nextInt();
		System.out.print("Enter the third number: ");
		int n3 = input.nextInt();
		System.out.print("Enter the fourth number: ");
		int n4 = input.nextInt();

		if (n1 == n2 && n2 == n3 && n3 == n4)
			System.out.println("Numbers are equal!");
		else
			System.out.println("Numbers are not equal!");
		input.close();
	}
}
