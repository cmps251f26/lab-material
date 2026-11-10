package part1;

public class Customer {
	private String name;
	private String phone;
	private int id;
	private Address address;

	public Customer(String name, String phone, int id) {
		this.name = name;
		this.phone = phone;
		this.id = id;
	}

	public Customer(String name, String phone, int id, Address address) {
		this(name, phone, id);
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// string concatenation calls address.toString() for us
		return "Name=" + name + ", phone=" + phone + ", id=" + id + ", address=" + address;
	}
}
