package exercise4;

public class Unit extends Residence {
	private String buildingName;
	private int unitNumber;

	public Unit(String street, int roomCount, String buildingName, int unitNumber) {
		super(street, roomCount);
		this.buildingName = buildingName;
		this.unitNumber = unitNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(int unitNumber) {
		this.unitNumber = unitNumber;
	}

	@Override
	public String toString() {
		return String.format("%s, building %s, unit #%d", super.toString(), buildingName, unitNumber);
	}
}
