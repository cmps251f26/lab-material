package part2;

public class BookTest {
	public static void main(String[] args) {
		Author author = new Author(1, "Herbert", "Schildt");
		Address pubAddress = new Address("1325 6th Ave", "New York", "NY", "10019");
		Publisher publisher = new Publisher(7, "McGraw Hill", "info@mheducation.com", pubAddress);

		Book book1 = new Book("978-1260463415", "Java: The Complete Reference", 52.5, author, publisher);
		System.out.println(book1);
		System.out.println();

		// same objects can be attached after construction with the setters
		Book book2 = new Book("978-0134743356", "Java How to Program", 89.99);
		book2.setAuthor(new Author(2, "Paul", "Deitel"));
		book2.setPublisher(new Publisher(8, "Pearson", "contact@pearson.com"));
		book2.getPublisher().setAddress(new Address("221 River St", "Hoboken", "NJ", "07030"));
		System.out.println(book2);
	}
}
