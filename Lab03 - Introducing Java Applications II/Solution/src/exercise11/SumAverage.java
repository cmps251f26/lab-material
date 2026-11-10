package exercise11;

import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int sum = 0;

		System.out.println("enter positive values, or -1 to quit:");
		int value = input.nextInt();
		while (value >= 0) {
			sum += value;
			count++;
			System.out.println("enter positive values, or -1 to quit:");
			value = input.nextInt();
		}

		if (count == 0) {
			System.out.println("No values entered.");
		} else {
			double average = (double) sum / count;
			System.out.printf("You entered %d numbers, sum is %d, average is %.2f%n", count, sum, average);
		}
		input.close();
	}
}
