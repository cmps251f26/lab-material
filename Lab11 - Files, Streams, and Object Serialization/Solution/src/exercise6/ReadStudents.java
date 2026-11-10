package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudents {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("Students.txt"));

			System.out.printf("%-12s %8s%n", "Name", "Average");
			while (in.hasNext()) {
				String name = in.next();
				double average = (in.nextDouble() + in.nextDouble() + in.nextDouble()) / 3;
				System.out.printf("%-12s %8.2f%n", name, average);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Run WriteStudents first: " + e.getMessage());
		}
	}
}
