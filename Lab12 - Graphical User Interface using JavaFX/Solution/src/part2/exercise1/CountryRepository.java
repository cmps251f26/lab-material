package part2.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Each line of countries.dat: code,name,capital,continent,region,population,area
// The file sits in the project folder, which is Eclipse's working directory when you run.
public class CountryRepository {
	private static final String FILE_NAME = "countries.dat";

	public static List<Country> countries = new ArrayList<>();

	public static void loadCountries() {
		countries.clear();
		try (Scanner input = new Scanner(new File(FILE_NAME), "UTF-8")) {
			while (input.hasNextLine()) {
				String line = input.nextLine().trim();
				if (line.isEmpty())
					continue;
				String[] parts = line.split(",");
				countries.add(new Country(parts[0], parts[1], parts[2], parts[3], parts[4],
						Long.parseLong(parts[5]), Double.parseDouble(parts[6])));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Could not find " + new File(FILE_NAME).getAbsolutePath());
		}
	}

	public static List<String> getContinents() {
		List<String> continents = new ArrayList<>();
		for (Country c : countries)
			if (!continents.contains(c.getContinent()))
				continents.add(c.getContinent());
		Collections.sort(continents);
		return continents;
	}

	public static List<String> getRegions(String continent) {
		List<String> regions = new ArrayList<>();
		for (Country c : countries)
			if (c.getContinent().equals(continent) && !regions.contains(c.getRegion()))
				regions.add(c.getRegion());
		Collections.sort(regions);
		return regions;
	}

	public static List<Country> getCountriesByRegion(String region) {
		List<Country> result = new ArrayList<>();
		for (Country c : countries)
			if (c.getRegion().equals(region))
				result.add(c);
		return result;
	}
}
