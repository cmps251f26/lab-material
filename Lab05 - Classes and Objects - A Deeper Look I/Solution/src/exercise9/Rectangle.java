package exercise9;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		this(0, 0);
	}

	public Rectangle(double side) {
		this(side, side);
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}
}
