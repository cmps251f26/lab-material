package exercise5;

public class TriangleArea {

	public static void main(String[] args) {
		double a = 10;
		double b = 9.85;
		double c = 10.5;

		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("Sides: a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("Area = " + area);
	}
}
