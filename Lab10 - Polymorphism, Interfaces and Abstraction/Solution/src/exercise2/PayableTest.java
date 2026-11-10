package exercise2;

import java.util.ArrayList;

public class PayableTest {
	public static void main(String[] args) {
		ArrayList<Payable> payables = new ArrayList<Payable>();

		payables.add(new Invoice("01234", "Textbook", 2, 375.00));
		payables.add(new Invoice("56789", "USB Disk", 3, 179.95));
		payables.add(new SalariedEmployee("Ahmed", "Ali", "111-11-1111", 15000.00));
		payables.add(new HourlyEmployee("Fatima", "Saleh", "222-22-2222", 160.75, 40));
		payables.add(new CommissionEmployee("Samir", "Sami", "333-33-3333", 100000, .06));

		System.out.println("Invoices and Employees processed polymorphically:\n");

		for (Payable payable : payables) {
			System.out.printf("ObjectType: %s - PaymentAmount = QR %.2f\n",
					payable.getClass().getSimpleName(),
					payable.getPaymentAmount());

			// getSalary() is not part of Payable, so we must downcast to call it
			if (payable instanceof SalariedEmployee) {
				SalariedEmployee salariedEmployee = (SalariedEmployee) payable;
				double oldSalary = salariedEmployee.getSalary();
				salariedEmployee.setSalary(oldSalary * 1.1);
				System.out.printf("New salary with 10%% increase is: QR %,.2f\n",
						salariedEmployee.getSalary());
			}
		}
	}
}
