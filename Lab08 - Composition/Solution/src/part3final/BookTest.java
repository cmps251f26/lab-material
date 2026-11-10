package part3final;

public class BookTest {
	public static void main(String[] args) {
		Publisher publisher = new Publisher(1, "Pearson", "contact@pearson.com");
		publisher.setAddress(new Address("123 Main St", "Anytown", "Anystate", "12345"));

		Book book1 = new Book("123-455-6656", "Art of War", 45.9);
		book1.setPublisher(publisher);
		book1.addChapter(new Chapter("Chapter 1: Introduction", 10));
		book1.addChapter(new Chapter("Chapter 2: Background", 15));
		book1.addChapter(new Chapter("Chapter 3: Results", 20));

		Author doe = new Author(1, "John", "Doe");
		Author smith = new Author(2, "Jane", "Smith");
		book1.addAuthor(doe);
		book1.addAuthor(smith);
		book1.addAuthor(new Author(1, "Johnny", "Doe")); // rejected: id 1 is already there

		System.out.println(book1);
		System.out.println("Number of authors: " + book1.getAuthorCount());

		System.out.println();
		book1.removeAuthor(smith);
		System.out.println(book1);
	}
}
