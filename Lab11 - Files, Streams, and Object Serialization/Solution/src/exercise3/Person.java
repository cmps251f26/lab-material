package exercise3;

import java.io.Serializable;

// Without "implements Serializable", writeObject throws NotSerializableException
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
