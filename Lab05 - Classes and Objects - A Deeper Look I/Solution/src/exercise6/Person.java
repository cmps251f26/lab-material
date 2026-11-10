package exercise6;

/**
 * A person with a name, age, weight and height. This is the Person class from
 * Lab 4 Exercise 3, documented with Javadoc comments.
 *
 * @author Abdulahi Hassen
 * @version 1.0
 */
public class Person {
	/**
	 * The first name of the person.
	 */
	private String firstName;
	/**
	 * The last name of the person.
	 */
	private String lastName;
	/**
	 * The age of the person.
	 */
	private int age;
	/**
	 * The weight of the person in kilograms.
	 */
	private double weight;
	/**
	 * The height of the person in meters.
	 */
	private double height;

	/**
	 * Creates a person with a name and an age.
	 *
	 * @param firstName
	 *            The first name of the person
	 * @param lastName
	 *            The last name of the person
	 * @param age
	 *            The age of the person
	 */
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
	}

	/**
	 * Creates a person with a name, age, weight and height.
	 *
	 * @param firstName
	 *            The first name of the person
	 * @param lastName
	 *            The last name of the person
	 * @param age
	 *            The age of the person
	 * @param weight
	 *            The weight of the person in kilograms
	 * @param height
	 *            The height of the person in meters
	 */
	public Person(String firstName, String lastName, int age, double weight, double height) {
		this(firstName, lastName, age);
		setWeight(weight);
		setHeight(height);
	}

	/**
	 * @return The first name of the person
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param first
	 *            The new first name
	 */
	public void setFirstName(String first) {
		firstName = first;
	}

	/**
	 * @return The last name of the person
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param last
	 *            The new last name
	 */
	public void setLastName(String last) {
		lastName = last;
	}

	/**
	 * @return The age of the person in years
	 */
	public int getAge() {
		return age;
	}

	/**
	 * This method sets the age field for a Person object. It ensures that the
	 * <br>
	 * argument is positive. If it is negative, the method does nothing.
	 *
	 * @param years
	 *            An integer value that represents the age in years.
	 */
	public void setAge(int years) {
		if (years > 0)
			age = years;
	}

	/**
	 * @return The weight of the person in kilograms
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            The weight in kilograms
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return The height of the person in meters
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            The height in meters
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Calculates the body-mass index as weight / height<sup>2</sup>.
	 *
	 * @return The BMI, or 0.0 if the weight or height is not positive
	 */
	public double getBMI() {
		if (weight <= 0 || height <= 0)
			return 0.0;
		return weight / (height * height);
	}
}
