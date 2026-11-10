package exercise8;

import java.util.Scanner;

public class Hypotenuse {
	public static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int triangle = 1; triangle <= 3; triangle++) {
			System.out.printf("Triangle %d - enter side 1 and side 2: ", triangle);
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			System.out.printf("Hypotenuse = %.1f%n", hypotenuse(side1, side2));
		}

		input.close();
	}
}
