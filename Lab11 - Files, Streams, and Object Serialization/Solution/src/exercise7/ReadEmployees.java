package exercise7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadEmployees {
	public static void main(String[] args) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee.dat"));

			@SuppressWarnings("unchecked") // the file holds the ArrayList<Employee> written by SaveEmployees
			ArrayList<Employee> employees = (ArrayList<Employee>) in.readObject();
			in.close();

			System.out.printf("%-5s %-10s %10s%n", "ID", "Name", "Salary");
			for (Employee e : employees)
				System.out.println(e);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Run SaveEmployees first: " + e);
		}
	}
}
