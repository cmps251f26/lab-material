package exercise3;

public class Triangle extends TwoDShape {

	public Triangle(double w, double h) {
		super(w, h);
	}

	@Override
	public double getArea() {
		return 0.5 * getHeight() * getWidth();
	}
}
