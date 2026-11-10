package exercise4.model;

import exercise1.model.Person;

public class Student extends Person {
	private String major;

	public Student() {
	}

	public Student(int id, String name, String major) {
		super(id, name);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + "," + major;
	}
}
