package exercise5;

import java.util.Scanner;

public class MonthNumber {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter Month: ");
		String month = cin.next();

		int number;
		// switch on a String is case-sensitive, so normalise the input first
		switch (month.toLowerCase()) {
		case "january": number = 1; break;
		case "february": number = 2; break;
		case "march": number = 3; break;
		case "april": number = 4; break;
		case "may": number = 5; break;
		case "june": number = 6; break;
		case "july": number = 7; break;
		case "august": number = 8; break;
		case "september": number = 9; break;
		case "october": number = 10; break;
		case "november": number = 11; break;
		case "december": number = 12; break;
		default: number = -1;
		}

		if (number == -1)
			System.out.println("Invalid month");
		else
			System.out.println(number);
		cin.close();
	}
}
