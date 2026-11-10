package exercise4;

public class Residence implements Cleanable {
	private String street;
	private int roomCount;
	private int cleaningCount;

	public Residence() {
	}

	public Residence(String street, int roomCount) {
		this.street = street;
		this.roomCount = roomCount;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getCleaningCount() {
		return cleaningCount;
	}

	@Override
	public void setCleaningCount(int cleaningCount) {
		this.cleaningCount = cleaningCount > 0 ? cleaningCount : 0;
	}

	@Override
	public int getFee(String type) {
		return fees.getOrDefault(type, 0);
	}

	@Override
	public double getCleaningAmount() {
		return cleaningCount * getFee(getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return String.format("%s on %s, %d rooms, cleaned %d time(s)",
				getClass().getSimpleName(), street, roomCount, cleaningCount);
	}
}
