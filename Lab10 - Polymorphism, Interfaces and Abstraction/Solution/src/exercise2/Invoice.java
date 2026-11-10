package exercise2;

public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double unitPrice;

	public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public double getPaymentAmount() {
		return quantity * unitPrice;
	}

	@Override
	public String toString() {
		return String.format("Invoice: %s (%s), %d x QR %.2f",
				partNumber, partDescription, quantity, unitPrice);
	}
}
