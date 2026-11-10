package exercise6;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CircleListTest {

	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of circles:");
		int size = input.nextInt();
		List<Circle> circles = new ArrayList<Circle>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the radius");
			double radius;
			try {
				radius = input.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Invalid radius, it will be set to 0");
				input.next();
				radius = 0;
			}
			circles.add(new Circle(radius));
		}

		System.out.println("Circles List:");
		printCircles(circles);

		try {
			System.out.printf("Average area: %.2f%n", getAverageArea(circles));

			System.out.println("Circle with the largest radius:");
			printCircle(findLargest(circles));

			scaleUp(circles);
			System.out.println("Circles after scaling up:");
			printCircles(circles);
			System.out.printf("Average area after scaling up: %.2f%n", getAverageArea(circles));
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		input.close();
	}

	public static Circle findLargest(List<Circle> circles) {
		Circle largest = circles.get(0);
		for (Circle c : circles) {
			if (c.getRadius() > largest.getRadius()) {
				largest = c;
			}
		}
		return largest;
	}

	public static double getAverageArea(List<Circle> circles) {
		// Dividing a double by 0 gives NaN rather than an exception, so we throw it ourselves
		if (circles.isEmpty()) {
			throw new ArithmeticException("cannot compute the average of an empty list");
		}
		double total = 0;
		for (Circle c : circles) {
			total += c.getArea();
		}
		return total / circles.size();
	}

	public static void scaleUp(List<Circle> circles) {
		SecureRandom random = new SecureRandom();
		for (Circle c : circles) {
			c.enlarge(2 + random.nextInt(8));
		}
	}

	public static void printCircles(List<Circle> circles) {
		for (Circle c : circles) {
			printCircle(c);
		}
	}

	public static void printCircle(Circle c) {
		System.out.printf("Radius: %.2f  Area: %.2f  Circumference: %.2f%n",
				c.getRadius(), c.getArea(), c.getCircumference());
	}
}
