package exercise7;

public class InchesToCentimeters {
	public static void main(String args[]) {
		System.out.printf("%6s\t%11s%n", "Inches", "Centimeters");
		for (int inches = 0; inches <= 50; inches += 2) {
			double centimeters = 2.54 * inches;
			System.out.printf("%6d\t%11.2f%n", inches, centimeters);
		}
	}
}
