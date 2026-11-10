package exercise3;

public class PersonTest {
	public static void main(String args[]) {
		Person person = new Person("Ahmed", "Ibrahim", 19);
		System.out.printf("Created %s %s, age %d\n",
				person.getFirstName(), person.getLastName(), person.getAge());

		person.setAge(person.getAge() + 1);
		System.out.printf("Happy Birthday to %s %s\nYour age is now %d\n",
				person.getFirstName(), person.getLastName(), person.getAge());

		Person me = new Person("Khalid", "Saleh", 20, 72.0, 1.76);
		System.out.printf("%nName: %s %s%nAge: %d%nWeight: %.1f kg%nHeight: %.2f m%nBMI: %.2f%n",
				me.getFirstName(), me.getLastName(), me.getAge(),
				me.getWeight(), me.getHeight(), me.getBMI());

		if (me.getBMI() >= 25)
			System.out.println("Overweight");
		else
			System.out.println("Healthy");
	}
}
