package exercise5;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Bob", "Jones", 2875.00);
		Employee employee2 = new Employee("Susan", "Baker", 3150.75);

		printYearlySalary(1, employee1);
		printYearlySalary(2, employee2);

		System.out.println("Increasing employee salaries by 10%");
		employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.10);
		employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.10);

		printYearlySalary(1, employee1);
		printYearlySalary(2, employee2);
	}

	private static void printYearlySalary(int number, Employee employee) {
		System.out.printf("Employee %d: %s %s; Yearly Salary: %.2f%n", number,
				employee.getFirstName(), employee.getLastName(), employee.getMonthlySalary() * 12);
	}
}
