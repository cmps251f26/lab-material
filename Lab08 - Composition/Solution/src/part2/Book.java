package part2;

public class Book {
	private String isbn;
	private String title;
	private double price;
	private Author author;
	private Publisher publisher;

	public Book(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public Book(String isbn, String title, double price, Author author) {
		this(isbn, title, price);
		this.author = author;
	}

	public Book(String isbn, String title, double price, Author author, Publisher publisher) {
		this(isbn, title, price, author);
		this.publisher = publisher;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "ISBN:" + isbn + ", Title:" + title + ", Price=" + price
				+ "\n  Author: " + author
				+ "\n  " + publisher;
	}
}
