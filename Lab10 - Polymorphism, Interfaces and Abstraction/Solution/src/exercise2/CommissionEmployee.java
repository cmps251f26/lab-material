package exercise2;

public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String qid,
			double grossSales, double commissionRate) {
		super(firstName, lastName, qid);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}

	@Override
	public String toString() {
		return String.format("Commission employee: %s, gross sales QR %.2f, rate %.2f",
				super.toString(), grossSales, commissionRate);
	}
}
