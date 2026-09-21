package exe;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the digits");
			int digits = scanner.nextInt();
			
			
			
			int sum = 0;
			
			while(digits > 0) {
				sum += digits % 10;;
				digits = digits/10;
			}

			System.out.printf("The sum of the digits is %d" , sum);
		}
	}

}
