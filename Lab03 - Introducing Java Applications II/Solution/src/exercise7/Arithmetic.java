package exercise7;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// read as text and convert, as the constraint asks
		System.out.print("What is the first number? ");
		int first = Integer.parseInt(input.nextLine().trim());
		System.out.print("What is the second number? ");
		int second = Integer.parseInt(input.nextLine().trim());

		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		if (second != 0)
			System.out.println(first + " / " + second + " = " + (first / second));
		else
			System.out.println("Cannot divide by zero");
		input.close();
	}
}
