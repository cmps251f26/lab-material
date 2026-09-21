package bank;

public class Account {
	
//	properties
	private int id;
	private String name;
	
	
	//default constructor
	public Account() {
		 
	}
	
//	Parameterized constructor
	public Account(int id, String name) {
		setId(id);
		setName(name);
	}
	
//	getters and setters [mutators and accessors]
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	//shadowing
	public void setName(String name) {
//		check if good assign , if bad dont
		this.name = name;
	}
	
//	member methods
	public void displayInfo() {
		System.out.println(getId() + " - " + getName()); 	
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}
	
	
}
