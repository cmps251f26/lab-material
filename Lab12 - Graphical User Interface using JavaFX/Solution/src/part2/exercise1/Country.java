package part2.exercise1;

public class Country {
	private String code;
	private String name;
	private String capital;
	private String continent;
	private String region;
	private long population;
	private double area;

	public Country(String code, String name, String capital, String continent, String region,
			long population, double area) {
		this.code = code;
		this.name = name;
		this.capital = capital;
		this.continent = continent;
		this.region = region;
		this.population = population;
		this.area = area;
	}

	// PropertyValueFactory("code") looks for getCode(), so these names matter
	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getContinent() {
		return continent;
	}

	public String getRegion() {
		return region;
	}

	public long getPopulation() {
		return population;
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return name;
	}
}
