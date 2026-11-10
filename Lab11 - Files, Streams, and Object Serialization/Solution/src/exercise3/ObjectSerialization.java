package exercise3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerialization {
	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persons.dat"));
			Person p1 = new Person("Ahmed");
			Person p2 = new Person("Hind");
			out.writeObject(p1);
			out.writeObject(p2);
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("persons.dat"));
			try {
				// readObject never returns null at the end of the file; it throws EOFException
				while (true) {
					Person p = (Person) in.readObject();
					System.out.println(p.getName());
				}
			} catch (EOFException eof) {
				System.out.println("Reached end of file.");
			} finally {
				in.close();
			}
		} catch (IOException | ClassNotFoundException exception) {
			System.out.println("Error: " + exception);
		}
	}
}
