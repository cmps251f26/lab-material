package exercise3;

import java.util.ArrayList;
import java.util.List;

import exercise1.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(2571, "Ghanim Salih"));
		people.add(new Person(1318, "Saad Mohamed"));
		people.add(new Person(5376, "Adil Salman"));

		for (Person p : people)
			System.out.println(p);
	}
}
