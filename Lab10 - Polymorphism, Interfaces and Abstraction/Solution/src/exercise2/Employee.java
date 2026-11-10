package exercise2;

// Employee does not implement getPaymentAmount(), so it has to be abstract.
// Each subclass decides how its pay is calculated.
public abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String qid;

	public Employee(String firstName, String lastName, String qid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.qid = qid;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getQid() {
		return qid;
	}

	@Override
	public String toString() {
		return String.format("%s %s (QID: %s)", firstName, lastName, qid);
	}
}
