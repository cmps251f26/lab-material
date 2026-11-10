package exercise2;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	// a constructor has no return type; "public void Person" was a normal method
	public Person(String first, String last, int years) {
		firstName = first;
		lastName = last;
		if (years > 0) // was "years < 0", which only kept invalid ages
			age = years;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first) {
		firstName = first;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last) {
		lastName = last;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int years) {
		if (years > 0)
			age = years;
	}
}
