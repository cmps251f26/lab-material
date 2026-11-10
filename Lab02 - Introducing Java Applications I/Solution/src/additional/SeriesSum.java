package additional;

import java.util.Scanner;

// Y = 1/2 + 3/4 + 5/6 + ... + n/(n+1)
public class SeriesSum {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter an odd number n: ");
		int n = cin.nextInt();

		if (n < 1 || n % 2 == 0) {
			System.out.println("n must be a positive odd number");
		} else {
			double y = 0;
			for (int k = 1; k <= n; k += 2)
				y += (double) k / (k + 1);
			System.out.printf("Y = %.4f%n", y);
		}
		cin.close();
	}
}
