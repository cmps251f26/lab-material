package part3;

import java.util.ArrayList;

public class Book {
	private String isbn;
	private String title;
	private double price;
	private Author author;
	private Publisher publisher;
	// created here so addChapter works without changing the constructors
	private ArrayList<Chapter> chapters = new ArrayList<>();

	public Book(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public Book(String isbn, String title, double price, Author author, Publisher publisher) {
		this(isbn, title, price);
		this.author = author;
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

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

	public void addChapter(Chapter c) {
		chapters.add(c);
	}

	public void removeChapter(Chapter c) {
		chapters.remove(c);
	}

	public int getChapterCount() {
		return chapters.size();
	}

	public int getPageCount() {
		int total = 0;
		for (Chapter c : chapters) {
			total += c.getPageCount();
		}
		return total;
	}

	@Override
	public String toString() {
		return String.format("%s[%s] by %s, %s%nPublished by: %s-%s, %s%n(%d chapters, %d pages, $%.2f, ISBN %s)",
				title, isbn, author.getLastName(), author.getFirstName(),
				publisher.getName(), publisher.getEmail(), publisher.getAddress(),
				getChapterCount(), getPageCount(), price, isbn);
	}
}
