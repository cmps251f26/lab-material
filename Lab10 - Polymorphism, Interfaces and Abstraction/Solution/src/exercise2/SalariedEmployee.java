package exercise2;

public class SalariedEmployee extends Employee {
	private double salary;

	public SalariedEmployee(String firstName, String lastName, String qid, double salary) {
		super(firstName, lastName, qid);
		setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary < 0 ? 0 : salary;
	}

	@Override
	public double getPaymentAmount() {
		return salary;
	}

	@Override
	public String toString() {
		return String.format("Salaried employee: %s, salary QR %.2f", super.toString(), salary);
	}
}
