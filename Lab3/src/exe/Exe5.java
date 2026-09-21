package exe;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a ");
			int a = scan.nextInt();
			
			System.out.println("Enter b ");
			int b = scan.nextInt();
			
			System.out.println("Enter c ");
			int c = scan.nextInt();
			
			System.out.println("Enter d ");
			int d = scan.nextInt();
			
			if(a == b && b==c && c == d) {
				System.out.println("All equal");
			}
			else {
				System.out.println("They are not");
			}
		}

	}

}
