package additional;

import java.util.Scanner;

public class LightBulb {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the wattage: ");
		int watts = cin.nextInt();

		int lumens;
		switch (watts) {
		case 15: lumens = 125; break;
		case 25: lumens = 215; break;
		case 40: lumens = 500; break;
		case 60: lumens = 880; break;
		case 75: lumens = 1000; break;
		case 100: lumens = 1675; break;
		default: lumens = -1;
		}

		System.out.println("Brightness: " + lumens + " lumens");
		cin.close();
	}
}
