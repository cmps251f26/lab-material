package exercise3;

public class Rectangle extends TwoDShape {

	public Rectangle(double w, double h) {
		super(w, h);
	}

	@Override
	public double getArea() {
		return getHeight() * getWidth();
	}
}
