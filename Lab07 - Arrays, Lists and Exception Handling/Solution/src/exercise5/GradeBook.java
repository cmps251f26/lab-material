package exercise5;

public class GradeBook {
	private String courseTitle;
	private int[] grades;

	public GradeBook(String courseTitle, int[] grades) {
		this.courseTitle = courseTitle;
		this.grades = grades;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public int minimum() {
		int lowest = grades[0];
		for (int grade : grades) {
			if (grade < lowest) {
				lowest = grade;
			}
		}
		return lowest;
	}

	public int maximum() {
		int highest = grades[0];
		for (int grade : grades) {
			if (grade > highest) {
				highest = grade;
			}
		}
		return highest;
	}

	public double average() {
		int total = 0;
		for (int grade : grades) {
			total += grade;
		}
		return (double) total / grades.length;
	}
}
