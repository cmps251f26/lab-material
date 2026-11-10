package exercise5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SavePersons {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"));

			System.out.print("Enter id (negative to stop): ");
			int id = kb.nextInt();
			while (id >= 0) {
				System.out.print("Enter name: ");
				String name = kb.next();
				System.out.print("Enter salary: ");
				double salary = kb.nextDouble();

				out.writeObject(new Person(id, name, salary));

				System.out.print("Enter id (negative to stop): ");
				id = kb.nextInt();
			}

			out.close();
			System.out.println("Saved to employees.dat");
		} catch (IOException e) {
			System.out.println("Error writing file: " + e);
		}
		kb.close();
	}
}
