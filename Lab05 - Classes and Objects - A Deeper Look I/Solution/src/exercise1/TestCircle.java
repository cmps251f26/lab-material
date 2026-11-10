package exercise1;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.5);
		Circle c3 = new Circle(25); // out of range, so radius becomes 1

		printCircle("c1", c1);
		printCircle("c2", c2);
		printCircle("c3", c3);

		c1.setRadius(10);
		System.out.println("After setting c1's radius to 10:");
		printCircle("c1", c1);
	}

	private static void printCircle(String name, Circle c) {
		System.out.printf("%s: radius = %.2f, circumference = %.2f, area = %.2f%n",
				name, c.getRadius(), c.getCircumference(), c.getArea());
	}
}
