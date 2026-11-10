package exercise6;

public class Circle {
	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius >= 0.0 && radius < 20.0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void enlarge(double scaleFactor) {
		if (scaleFactor > 1) {
			radius = radius * scaleFactor;
		}
	}
}
