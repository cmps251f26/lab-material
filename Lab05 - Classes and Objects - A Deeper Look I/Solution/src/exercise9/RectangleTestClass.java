package exercise9;

public class RectangleTestClass {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4);
		Rectangle r3 = new Rectangle(5, 3);

		System.out.println("Area of r1 (no parameters): " + r1.getArea());
		System.out.println("Area of r2 (one parameter): " + r2.getArea());
		System.out.println("Area of r3 (two parameters): " + r3.getArea());
	}
}
