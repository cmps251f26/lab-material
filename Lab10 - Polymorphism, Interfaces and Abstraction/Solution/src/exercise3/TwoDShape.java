package exercise3;

// Still abstract: it inherits getArea() from Shape without implementing it.
public abstract class TwoDShape extends Shape {
	private double width;
	private double height;

	public TwoDShape(double w, double h) {
		setWidth(w);
		setHeight(h);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width > 0 ? width : 0;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height > 0 ? height : 0;
	}

	// getArea() is resolved at run time to the Triangle or Rectangle version
	public void operation() {
		System.out.printf("%s: width = %.2f, height = %.2f, area = %.2f\n",
				getClass().getSimpleName(), width, height, getArea());
	}
}
