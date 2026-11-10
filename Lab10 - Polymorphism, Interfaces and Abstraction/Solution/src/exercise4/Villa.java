package exercise4;

public class Villa extends Residence {
	private int floorsCount;

	public Villa(String street, int roomCount, int floorsCount) {
		super(street, roomCount);
		this.floorsCount = floorsCount;
	}

	public int getFloorsCount() {
		return floorsCount;
	}

	public void setFloorsCount(int floorsCount) {
		this.floorsCount = floorsCount;
	}

	@Override
	public String toString() {
		return String.format("%s, %d floor(s)", super.toString(), floorsCount);
	}
}
