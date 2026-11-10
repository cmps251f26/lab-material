package exercise8;

import java.util.Scanner;

public class PizzaParty {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many people? ");
		int people = input.nextInt();
		System.out.print("How many pizzas do you have? ");
		int pizzas = input.nextInt();
		System.out.print("How many slices per pizza? ");
		int slicesPerPizza = input.nextInt();

		int totalSlices = pizzas * slicesPerPizza;
		int eachPerson = totalSlices / people;
		int leftover = totalSlices % people;

		System.out.println(people + " people with " + pizzas + " pizzas...");
		System.out.println("Each person gets " + eachPerson + " slices of pizza.");
		if (leftover > 0)
			System.out.println("There are " + leftover + " leftover slices.");
		input.close();
	}
}
