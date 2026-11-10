package exercise2;

public class Major {
	private int majorId;
	private String title;
	private int hostDeptId;
	private int totalCreditHours;

	public Major() {
		this(999, "Unknown", 888, 0);
	}

	public Major(int majorId, String title, int hostDeptId, int totalCreditHours) {
		this.majorId = majorId;
		this.title = title;
		this.hostDeptId = hostDeptId;
		this.totalCreditHours = totalCreditHours;
	}

	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHostDeptId() {
		return hostDeptId;
	}

	public void setHostDeptId(int hostDeptId) {
		this.hostDeptId = hostDeptId;
	}

	public int getTotalCreditHours() {
		return totalCreditHours;
	}

	public void setTotalCreditHours(int totalCreditHours) {
		this.totalCreditHours = totalCreditHours;
	}

	public void display() {
		System.out.println("Major ID: " + majorId);
		System.out.println("Title: " + title);
		System.out.println("Host Department ID: " + hostDeptId);
		System.out.println("Credit Hours: " + totalCreditHours);
	}
}
