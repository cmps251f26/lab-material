package exercise10;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 4 integer values for (x1, y1) & (x2, y2) respectively: ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.printf("Distance between (%d, %d) & (%d, %d) is %.2f%n", x1, y1, x2, y2, distance);
		input.close();
	}
}
