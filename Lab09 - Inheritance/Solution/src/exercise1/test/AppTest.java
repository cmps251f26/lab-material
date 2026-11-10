package exercise1.test;

import exercise1.model.Employee;

public class AppTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		// setId and setName are inherited from Person
		emp1.setId(123);
		emp1.setName("Khaled");
		emp1.setNoOfChildren(2);

		System.out.println("Name: " + emp1.getName());
		System.out.println("Id: " + emp1.getId());
		System.out.println("No of children: " + emp1.getNoOfChildren());

		Employee emp2 = new Employee(124, "Ameen", 1);
		System.out.println(emp2);
	}
}
