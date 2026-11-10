package exercise2;

public class PersonTest {
	public static void main(String args[]) {
		Person person = new Person("Ahmed", "Ibrahim", 19);

		System.out.printf("Created %s %s, age %d\n",
				person.getFirstName(), person.getLastName(), person.getAge());

		person.setAge(person.getAge() + 1);

		System.out.printf("Happy Birthday to %s %s\n",
				person.getFirstName(), person.getLastName());
	}
}
