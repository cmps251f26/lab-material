package exercise6;

import java.util.Scanner;

public class TimeFormat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time in seconds: ");
		int totalSeconds = input.nextInt();

		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600) / 60;
		int seconds = totalSeconds % 60;

		System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
		input.close();
	}
}
