package exercise2;

public class MajorTest {
	public static void main(String[] args) {
		Major cs = new Major(101, "Computer Science", 10, 120);
		Major ce = new Major(102, "Computer Engineering", 11, 132);
		Major unknown = new Major();

		cs.display();
		System.out.println();
		ce.display();
		System.out.println();
		unknown.display();
	}
}
