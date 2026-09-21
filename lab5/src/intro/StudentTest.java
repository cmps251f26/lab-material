package intro;

public class StudentTest {

	public static void main(String[] args) {
		
//		test the default constructor 
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Ali");
		s2.setName("Mohamed");
		
		s1.count = 90;
		s2.count = 100;
		Student.count = 1000;
	
		
		System.out.println(s1.toString());
		System.out.println(s1.toString());

		
		System.out.println("Student count = " +  Student.count);
		System.out.println("Student count = " +  s1.count);
		System.out.println("Student count = " +  s2.count);
		
		
// test the constructor with id and name
		

	}

}
