package exercise6;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
		Invoice invoice2 = new Invoice("5678", "Paint brush", -5, -9.99);

		printInvoice(invoice1);
		printInvoice(invoice2);

		System.out.println("Updating invoice 2...");
		invoice2.setQuantity(3);
		invoice2.setPricePerItem(9.99);
		printInvoice(invoice2);
	}

	private static void printInvoice(Invoice invoice) {
		System.out.printf("Part %s (%s): %d x %.2f = %.2f%n",
				invoice.getPartNumber(), invoice.getPartDescription(),
				invoice.getQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAmount());
	}
}
