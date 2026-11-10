package exercise7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveEmployees {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

		try {
			Scanner in = new Scanner(new File("data/Employee.txt"));
			while (in.hasNext())
				employees.add(new Employee(in.nextInt(), in.next(), in.nextDouble()));
			in.close();

			// ArrayList is Serializable, so the whole list is written as a single object
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.dat"));
			out.writeObject(employees);
			out.close();

			System.out.println(employees.size() + " employees saved to Employee.dat");
		} catch (IOException e) {
			System.out.println("File error: " + e);
		}
	}
}
