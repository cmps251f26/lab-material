package part3;

public class BookTest {
	public static void main(String[] args) {
		Chapter ch1 = new Chapter("Chapter 1: Introduction", 10);
		Chapter ch2 = new Chapter("Chapter 2: Background", 15);
		Chapter ch3 = new Chapter("Chapter 3: Results", 20);

		Author author1 = new Author(1, "John", "Doe");
		Publisher publisher = new Publisher(1, "Pearson", "contact@pearson.com");
		Address address = new Address("123 Main St", "Anytown", "Anystate", "12345");
		publisher.setAddress(address);

		Book book1 = new Book("123-455-6656", "Art of War", 45.9);
		book1.setPublisher(publisher);
		book1.setAuthor(author1);
		book1.addChapter(ch1);
		book1.addChapter(ch2);
		book1.addChapter(ch3);
		System.out.println(book1);

		System.out.println();
		book1.removeChapter(ch2);
		System.out.println("After removing " + ch2 + ":");
		System.out.println(book1);
	}
}
