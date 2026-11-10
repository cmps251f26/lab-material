package exercise7;

import java.util.Scanner;

public class PrimeNumbers {
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		// a factor larger than sqrt(n) would need a partner smaller than sqrt(n)
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		if (isPrime(number))
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not prime");

		System.out.println("Prime numbers between 1 and 100:");
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		System.out.println();

		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if (isPrime(i))
				count++;
		}
		System.out.println("Number of primes between 1 and 1000: " + count);

		input.close();
	}
}
