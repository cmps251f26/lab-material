package exercise3;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int number = Math.abs(input.nextInt());

		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		System.out.println("The sum of the digits is: " + sum);
		input.close();
	}
}
