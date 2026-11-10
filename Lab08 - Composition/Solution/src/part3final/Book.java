package part3final;

import java.util.ArrayList;

public class Book {
	private String isbn;
	private String title;
	private double price;
	private ArrayList<Author> authors = new ArrayList<>();
	private Publisher publisher;
	private ArrayList<Chapter> chapters = new ArrayList<>();

	public Book(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
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

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}

	public int getAuthorCount() {
		return authors.size();
	}

	// two authors are the same if they have the same id
	public void addAuthor(Author a) {
		for (Author existing : authors) {
			if (existing.getId() == a.getId()) {
				System.out.println("Author with id " + a.getId() + " is already on this book.");
				return;
			}
		}
		authors.add(a);
	}

	public void removeAuthor(Author a) {
		authors.remove(a);
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
		String names = "";
		for (int i = 0; i < authors.size(); i++) {
			Author a = authors.get(i);
			if (i > 0) {
				names += "; ";
			}
			names += a.getLastName() + ", " + a.getFirstName();
		}

		return String.format("%s[%s] by %s%nPublished by: %s-%s, %s%n(%d chapters, %d pages, $%.2f, ISBN %s)",
				title, isbn, names,
				publisher.getName(), publisher.getEmail(), publisher.getAddress(),
				getChapterCount(), getPageCount(), price, isbn);
	}
}
