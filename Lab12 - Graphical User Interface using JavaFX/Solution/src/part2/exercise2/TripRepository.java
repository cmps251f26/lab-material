package part2.exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// trips.dat:     country,type,from,to,rating   (dates as yyyy-mm-dd)
// countries.dat: the same file used by exercise 1; only the name column is needed here
public class TripRepository {

	public static List<Trip> getTrips() {
		List<Trip> trips = new ArrayList<>();
		try (Scanner input = new Scanner(new File("trips.dat"), "UTF-8")) {
			while (input.hasNextLine()) {
				String line = input.nextLine().trim();
				if (line.isEmpty())
					continue;
				String[] parts = line.split(",");
				trips.add(new Trip(parts[0], parts[1], LocalDate.parse(parts[2]),
						LocalDate.parse(parts[3]), parts[4]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("trips.dat not found");
		}
		return trips;
	}

	public static List<String> getCountries() {
		List<String> names = new ArrayList<>();
		try (Scanner input = new Scanner(new File("countries.dat"), "UTF-8")) {
			while (input.hasNextLine()) {
				String line = input.nextLine().trim();
				if (!line.isEmpty())
					names.add(line.split(",")[1]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("countries.dat not found");
		}
		Collections.sort(names);
		return names;
	}

	public static List<String> getRatings() {
		List<String> ratings = new ArrayList<>();
		ratings.add("Excellent");
		ratings.add("Good");
		ratings.add("Poor");
		return ratings;
	}
}
