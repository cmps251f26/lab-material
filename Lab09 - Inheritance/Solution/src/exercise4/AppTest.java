package exercise4;

import exercise4.model.Student;

public class AppTest {

	public static void main(String[] args) {
		Student s1 = new Student(201901, "Fatima Ali", "Computer Science");
		Student s2 = new Student(202054, "Yousef Hamad", "Computer Engineering");

		System.out.println(s1);
		System.out.println(s2);
	}
}
