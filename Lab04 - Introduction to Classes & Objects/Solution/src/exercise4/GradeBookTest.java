package exercise4;

public class GradeBookTest {
	public static void main(String args[]) {
		GradeBook gradeBook1 = new GradeBook("CMPS252 OO Programming Lab", "Ahmed Ali");
		gradeBook1.displayMessage();

		System.out.println("\nChanging course instructor:");
		gradeBook1.setInstructorName("Omar Khalid");
		gradeBook1.displayMessage();

		System.out.println();
		GradeBook gradeBook2 = new GradeBook("CMPS251: OO Programming", "Dr. Abdulahi Hassen");
		gradeBook2.displayMessage();
	}
}
