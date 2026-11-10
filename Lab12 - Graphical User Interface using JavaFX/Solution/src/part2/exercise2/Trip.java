package part2.exercise2;

import java.time.LocalDate;

public class Trip {
	private String country;
	private String type;
	private LocalDate from;
	private LocalDate to;
	private String rating;

	public Trip(String country, String type, LocalDate from, LocalDate to, String rating) {
		this.country = country;
		this.type = type;
		this.from = from;
		this.to = to;
		this.rating = rating;
	}

	public String getCountry() {
		return country;
	}

	public String getType() {
		return type;
	}

	public LocalDate getFrom() {
		return from;
	}

	public LocalDate getTo() {
		return to;
	}

	public String getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return country + "," + type + "," + from + "," + to + "," + rating;
	}
}
