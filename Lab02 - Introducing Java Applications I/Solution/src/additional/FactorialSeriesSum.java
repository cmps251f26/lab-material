package additional;

import java.util.Scanner;

// Y = 1/2! + 3/4! + 5/6! + ... + n/(n+1)!
public class FactorialSeriesSum {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter an odd number n: ");
		int n = cin.nextInt();

		if (n < 1 || n % 2 == 0) {
			System.out.println("n must be a positive odd number");
		} else {
			double y = 0;
			for (int k = 1; k <= n; k += 2) {
				// double, because (n+1)! overflows long once n passes 19
				double factorial = 1;
				for (int i = 2; i <= k + 1; i++)
					factorial *= i;
				y += k / factorial;
			}
			System.out.printf("Y = %.6f%n", y);
		}
		cin.close();
	}
}
