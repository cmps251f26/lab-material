package exercise5;

import java.util.ArrayList;

public class GradeBookTest {

	public static void main(String[] args) {
		int[] grade151 = {90, 50, 70, 80, 100, 90, 50, 70, 80, 95, 90, 55, 75, 85, 100};
		GradeBook gradeBook1 = new GradeBook("Programming Concepts", grade151);
		display(gradeBook1);
		System.out.println("Minimum Grades: " + gradeBook1.minimum());
		System.out.println("Maximum Grades: " + gradeBook1.maximum());
		System.out.println("Average Grades: " + gradeBook1.average());

		int[] grade251 = {85, 92, 60, 78, 88, 45, 99, 73};
		int[] grade351 = {65, 70, 98, 81, 59, 77};

		ArrayList<GradeBook> gradeBooks = new ArrayList<GradeBook>();
		gradeBooks.add(gradeBook1);
		gradeBooks.add(new GradeBook("Object-Oriented Programming", grade251));
		gradeBooks.add(new GradeBook("Data Structures", grade351));

		System.out.println();
		for (GradeBook gb : gradeBooks) {
			display(gb);
		}
		System.out.println("Minimum grade in all GradeBooks: " + minimum(gradeBooks));
		System.out.println("Maximum grade in all GradeBooks: " + maximum(gradeBooks));
		System.out.printf("Average grade in all GradeBooks: %.2f%n", average(gradeBooks));
	}

	public static void display(GradeBook gradeBook) {
		System.out.print(gradeBook.getCourseTitle() + ":");
		for (int grade : gradeBook.getGrades()) {
			System.out.print(" " + grade);
		}
		System.out.println();
	}

	public static int minimum(ArrayList<GradeBook> gradeBooks) {
		int lowest = gradeBooks.get(0).minimum();
		for (GradeBook gb : gradeBooks) {
			if (gb.minimum() < lowest) {
				lowest = gb.minimum();
			}
		}
		return lowest;
	}

	public static int maximum(ArrayList<GradeBook> gradeBooks) {
		int highest = gradeBooks.get(0).maximum();
		for (GradeBook gb : gradeBooks) {
			if (gb.maximum() > highest) {
				highest = gb.maximum();
			}
		}
		return highest;
	}

	// Average of every grade in every GradeBook, not the average of the averages,
	// since the courses have different numbers of students.
	public static double average(ArrayList<GradeBook> gradeBooks) {
		int total = 0;
		int count = 0;
		for (GradeBook gb : gradeBooks) {
			for (int grade : gb.getGrades()) {
				total += grade;
				count++;
			}
		}
		return (double) total / count;
	}
}
