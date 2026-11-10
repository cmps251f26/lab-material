package exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArrayTest {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();
		Circle circles[] = new Circle[size];

		for (int i = 0; i < circles.length; i++) {
			System.out.println("Enter the radius");
			double radius;
			try {
				radius = input.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Invalid radius, it will be set to 0");
				input.next(); // discard the bad token, otherwise nextDouble() fails again
				radius = 0;
			}
			circles[i] = new Circle(radius);
		}

		System.out.println("Circles List:");
		for (int i = 0; i < circles.length; i++) {
			printCircle(circles[i]);
		}

		if (circles.length > 0) {
			System.out.println("Circle with the largest radius:");
			printCircle(findLargest(circles));
		}

		input.close();
	}

	public static Circle findLargest(Circle circles[]) {
		Circle largest = circles[0];
		for (Circle c : circles) {
			if (c.getRadius() > largest.getRadius()) {
				largest = c;
			}
		}
		return largest;
	}

	public static void printCircle(Circle c) {
		System.out.printf("Radius: %.2f  Area: %.2f  Circumference: %.2f%n",
				c.getRadius(), c.getArea(), c.getCircumference());
	}
}
