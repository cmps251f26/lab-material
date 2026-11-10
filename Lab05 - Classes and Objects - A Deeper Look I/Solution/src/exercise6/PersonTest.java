package exercise6;

/**
 * Test application for the {@link Person} class.
 *
 * @author Abdulahi Hassen
 * @version 1.0
 */
public class PersonTest {
	/**
	 * Creates a person, prints their details and BMI.
	 *
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		Person person = new Person("Ahmed", "Ibrahim", 19, 82.0, 1.75);

		System.out.printf("Name: %s %s%nAge: %d%nBMI: %.1f%n",
				person.getFirstName(), person.getLastName(), person.getAge(), person.getBMI());

		if (person.getBMI() >= 25)
			System.out.println("Overweight");
		else
			System.out.println("Healthy");
	}
}
