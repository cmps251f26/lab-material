package exercise3;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int n1 = cin.nextInt();
		int n2 = cin.nextInt();
		int n3 = cin.nextInt();

		int sum = n1 + n2 + n3;
		double average = sum / 3.0; // 3.0, not 3, or the decimal part is lost

		System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		cin.close();
	}
}
