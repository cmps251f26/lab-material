package exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWriterDemo {
	public static void main(String[] args) {
		Formatter out = null;
		Scanner kb = new Scanner(System.in);
		try {
			// true = append mode: new text goes after the existing content
			FileWriter fileWriter = new FileWriter("MyOutFile.txt", true);
			out = new Formatter(fileWriter);
		} catch (IOException ioe) {
			System.out.println("File is not opened. Exception occurred..\n" + ioe);
		}

		if (out != null) {
			System.out.println("Enter data to be saved. When done enter <Ctrl+Z>");
			while (kb.hasNext()) {
				String line = kb.nextLine();
				out.format("%s%n", line);
			}
			out.close();
		}
		kb.close();
	}
}
