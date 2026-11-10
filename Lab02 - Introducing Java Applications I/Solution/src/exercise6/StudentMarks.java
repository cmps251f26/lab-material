package exercise6;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);

		System.out.print("Enter Math's mark: ");
		int math = cin.nextInt();
		System.out.print("Enter Computer's mark: ");
		int computer = cin.nextInt();
		System.out.print("Enter Music's mark: ");
		int music = cin.nextInt();

		int highest = math;
		if (computer > highest)
			highest = computer;
		if (music > highest)
			highest = music;

		int lowest = math;
		if (computer < lowest)
			lowest = computer;
		if (music < lowest)
			lowest = music;

		int total = math + computer + music;
		double average = total / 3.0;

		System.out.println("Highest mark is " + highest);
		System.out.println("Lowest mark is " + lowest);
		System.out.println("Total mark is " + total);
		System.out.printf("Average mark is %.2f%n", average);
		cin.close();
	}
}
