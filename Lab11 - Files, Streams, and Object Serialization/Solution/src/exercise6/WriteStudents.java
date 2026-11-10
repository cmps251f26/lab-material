package exercise6;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteStudents {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			Formatter out = new Formatter("Students.txt");

			System.out.print("How many students? ");
			int count = kb.nextInt();

			for (int i = 1; i <= count; i++) {
				System.out.printf("Student %d name: ", i);
				String name = kb.next();
				System.out.print("Three grades: ");
				double g1 = kb.nextDouble();
				double g2 = kb.nextDouble();
				double g3 = kb.nextDouble();

				out.format("%s %.2f %.2f %.2f%n", name, g1, g2, g3);
			}

			out.close();
			System.out.println("Saved to Students.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create file: " + e.getMessage());
		}
		kb.close();
	}
}
