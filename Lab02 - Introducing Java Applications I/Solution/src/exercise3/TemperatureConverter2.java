package exercise3;

public class TemperatureConverter2 {
	public static void main(String args[]) {
		System.out.println("Fahrenheit\tCentigrade");
		for (int fahr = 0; fahr <= 100; fahr += 10) {
			double centigrade = 5.0 * (fahr - 32) / 9.0;
			String formattedLine = String.format("%10d\t%10.2f%n", fahr, centigrade);
			System.out.print(formattedLine);
		}
	}
}
