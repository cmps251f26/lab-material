package exercise3;

import java.util.Scanner;

public class IntNumbersTest {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a value for n: ");
		int n = keyboard.nextInt();
		System.out.println(IntNumbers.digits(n));
		System.out.println(Math.sqrt(n));
		keyboard.close();
	}
}
