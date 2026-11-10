package exercise3;

import java.util.ArrayList;

public class ShapeTest {
	public static void main(String[] args) {
		// Shape s = new Shape();  does not compile: Shape is abstract

		ArrayList<TwoDShape> shapes = new ArrayList<TwoDShape>();
		shapes.add(new Triangle(6, 4));
		shapes.add(new Rectangle(6, 4));
		shapes.add(new Triangle(10, 3.5));
		shapes.add(new Rectangle(2.5, 8));

		double totalArea = 0;
		for (TwoDShape shape : shapes) {
			shape.operation();
			totalArea += shape.getArea();
		}
		System.out.printf("Total area of all shapes = %.2f\n", totalArea);
	}
}
