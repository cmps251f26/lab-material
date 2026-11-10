package exercise1;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		int readings[] = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < readings.length; i++) {
			System.out.print("Enter element no. " + i + " -->");
			readings[i] = input.nextInt();
		}

		System.out.print("Enter a value to search for: ");
		int value = input.nextInt();
		int index = search(readings, value);
		if (index == -1) {
			System.out.println(value + " was not found");
		} else {
			System.out.println(value + " was found at index " + index);
		}

		replace(readings, 2, 9);
		System.out.println("After replacing every 2 with 9:");
		printArray(readings);

		input.close();
	}

	public static int search(int theArray[], int value) {
		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void replace(int theArray[], int searchValue, int replaceValue) {
		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == searchValue) {
				theArray[i] = replaceValue;
			}
		}
	}

	public static void printArray(int theArray[]) {
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
}
