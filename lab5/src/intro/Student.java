package intro;

public class Student {

	//	attributes , properties 
	private int id;
	private String name;
	private int age;
	
	//	static properties
	
	static int count = 0;
	
	//constructor : create and initialize // Default constructor 
	// Overloading
	public Student() {
//		count = count + 1;
		count++; 
		this.age = 0;
	}
	public Student(int id , String name) {
		this();
		this.id = id;
		this.name = name;
	
	}
	
	public Student (int id , String name , int age) {
		this(id, name); //you are calling the constructor to initialize
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
