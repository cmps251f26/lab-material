package exercise4;

import java.security.SecureRandom;
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
				input.next();
				radius = 0;
			}
			circles[i] = new Circle(radius);
		}

		System.out.println("Circles List:");
		printCircles(circles);

		if (circles.length > 0) {
			System.out.println("Circle with the largest radius:");
			printCircle(findLargest(circles));

			System.out.printf("Average area: %.2f%n", getAverageArea(circles));

			scaleUp(circles);
			System.out.println("Circles after scaling up:");
			printCircles(circles);
			System.out.printf("Average area after scaling up: %.2f%n", getAverageArea(circles));
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

	public static double getAverageArea(Circle circles[]) {
		double total = 0;
		for (Circle c : circles) {
			total += c.getArea();
		}
		return total / circles.length;
	}

	public static void scaleUp(Circle circles[]) {
		SecureRandom random = new SecureRandom();
		for (Circle c : circles) {
			c.enlarge(2 + random.nextInt(8)); // 2 to 9 inclusive
		}
	}

	public static void printCircles(Circle circles[]) {
		for (Circle c : circles) {
			printCircle(c);
		}
	}

	public static void printCircle(Circle c) {
		System.out.printf("Radius: %.2f  Area: %.2f  Circumference: %.2f%n",
				c.getRadius(), c.getArea(), c.getCircumference());
	}
}
