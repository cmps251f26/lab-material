package part3;

public class Publisher {
	private int id;
	private String name;
	private String email;
	private Address address;

	public Publisher(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Publisher(int id, String name, String email, Address address) {
		this(id, name, email);
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Publisher ID: " + id + ", " + name + ", email=" + email + ", address=" + address;
	}
}
