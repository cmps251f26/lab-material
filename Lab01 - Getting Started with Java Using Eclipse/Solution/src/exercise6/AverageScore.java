package exercise6;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter Math score: ");
		double math = cin.nextDouble();
		System.out.print("Enter Computer score: ");
		double computer = cin.nextDouble();
		System.out.print("Enter English score: ");
		double english = cin.nextDouble();

		double average = (math + computer + english) / 3;

		if (average < 60)
			System.out.println("Average: " + average + " *");
		else
			System.out.println("Average: " + average);
		cin.close();
	}
}
