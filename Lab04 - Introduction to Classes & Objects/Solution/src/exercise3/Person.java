package exercise3;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double weight; // kg
	private double height; // m

	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}

	public Person(String firstName, String lastName, int age, double weight, double height) {
		this(firstName, lastName, age);
		setWeight(weight);
		setHeight(height);
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBMI() {
		if (weight <= 0 || height <= 0)
			return 0.0;
		return weight / (height * height);
	}
}
