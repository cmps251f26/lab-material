package project21;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		read a string from the user
		
		System.out.print("\nPlease enter your name - ");
		String name = input.next();
		
		System.out.print("\nPlease enter your age ");
		int age = input.nextInt();
		
		System.out.print("\nPlease enter your height ");
		double height = input.nextDouble();
		
		
//		System.out.println("Please enter your bio");
//		String bio = input.nextLine();
		
		input.close();
		
		System.out.printf("Name : %15s %25d %15.2f" , name , age , height );
	
		/* A multi-line comment
		
			for( int i = 0; i < 6 ; i++) {
				System.out.println("Welcome Mr. Ali" );
				System.out.println(i);
			}
		*/
		 
	
	}

}
