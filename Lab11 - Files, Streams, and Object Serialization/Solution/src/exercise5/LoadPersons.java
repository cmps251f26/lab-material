package exercise5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadPersons {
	private static ArrayList<Person> persons = new ArrayList<>();

	public static void main(String[] args) {
		loadFile("employees.dat");
		System.out.println(persons.size() + " persons loaded:");
		for (Person p : persons)
			System.out.println(p);

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter an id to search for: ");
		int searchId = kb.nextInt();

		Person found = getPerson(searchId);
		if (found != null)
			System.out.printf("Salary of %s: %.2f%n", found.getName(), found.getSalary());
		else
			System.out.println("No person with id " + searchId);
		kb.close();
	}

	private static void loadFile(String fileName) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
			try {
				while (true)
					persons.add((Person) in.readObject());
			} catch (EOFException eof) {
				// end of file: everything has been read
			} finally {
				in.close();
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error reading file: " + e);
		}
	}

	public static Person getPerson(int searchId) {
		for (Person p : persons)
			if (p.getId() == searchId)
				return p;
		return null;
	}
}
