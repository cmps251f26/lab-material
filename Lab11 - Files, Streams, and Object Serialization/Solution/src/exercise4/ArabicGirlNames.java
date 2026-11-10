package exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ArabicGirlNames {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data/Names.txt"));
			Formatter out = new Formatter("ArabicNames.txt");

			String header = String.format("%-10s %-7s %-8s%n", "Name", "Gender", "TestNum");
			System.out.print(header);
			out.format("%s", header);

			in.nextLine(); // skip the column titles
			while (in.hasNext()) {
				String name = in.next();
				String gender = in.next();
				String origin = in.next();
				String testNum = in.next();

				if (gender.equalsIgnoreCase("F") && origin.equalsIgnoreCase("Arabic")) {
					String line = String.format("%-10s %-7s %-8s%n", name, gender, testNum);
					System.out.print(line);
					out.format("%s", line);
				}
			}

			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open file: " + e.getMessage());
		}
	}
}
