package part1;

public class CustomerTest {
	public static void main(String[] args) {
		Address home = new Address("Al Tarfa St", "Doha", "Ad Dawhah", "2713");
		Customer c1 = new Customer("Ahmed Ali", "5551-2233", 101, home);

		Customer c2 = new Customer("Sara Hassan", "6677-8899", 102);
		c2.setAddress(new Address("Al Rayyan Rd", "Al Rayyan", "Ar Rayyan", "1240"));

		System.out.println(c1);
		System.out.println(c2);

		// change only the city of c2; the customer keeps the same Address object
		c2.getAddress().setCity("Lusail");
		System.out.println("After moving: " + c2);
	}
}
