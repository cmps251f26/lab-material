package exercise2;

import java.util.Scanner;

public class Compare2 {
	public static void main(String args[]) {
		int mark;
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter mark (an integer):");
		mark = cin.nextInt();

		// integer division: 80-100 -> 4 or 5, 60-79 -> 3, 40-59 -> 2
		switch (mark / 20) {
		case 4:
		case 5:
			System.out.println("Excellent");
			break;
		case 3:
			System.out.println("Very Good");
			break;
		case 2:
			System.out.println("Good");
			break;
		default:
			System.out.println("Fail");
		}
		cin.close();
	}
}
