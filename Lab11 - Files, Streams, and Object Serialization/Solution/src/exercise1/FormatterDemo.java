package exercise1;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class FormatterDemo {
	public static void main(String[] args) {
		Formatter out = null;
		Scanner kb = new Scanner(System.in);
		try {
			out = new Formatter(new File("MyOutFile.txt"));
		} catch (IOException ioe) {
			System.out.println("File is not opened. Exception occurred..\n" + ioe);
		}

		if (out != null) {
			// Ctrl+Z on Windows, Ctrl+D on macOS/Linux ends the input
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
