package exercise4;

import java.time.LocalDate;

public class Vehicle implements Cleanable {
	private String plateNumber;
	private int wheels;
	private int weight;
	private LocalDate registrationDate;
	private int cleaningCount;

	public Vehicle() {
	}

	public Vehicle(String plateNumber, int wheels, int weight, LocalDate registrationDate, int cleaningCount) {
		this.plateNumber = plateNumber;
		this.wheels = wheels;
		this.weight = weight;
		this.registrationDate = registrationDate;
		setCleaningCount(cleaningCount);
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
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
		// A plain Vehicle has no fee in the map, so it is charged 0
		return fees.getOrDefault(type, 0);
	}

	@Override
	public double getCleaningAmount() {
		// getSimpleName() gives "Car" or "Truck" for the subclasses,
		// which is exactly the key used in the fees map
		return cleaningCount * getFee(getClass().getSimpleName());
	}

	@Override
	public String toString() {
		if (plateNumber == null)
			return "";

		String className = getClass().getSimpleName();
		String dashes = "";
		for (int i = 0; i < className.length(); i++)
			dashes += "-";

		return "\n" + className
				+ "\n" + dashes
				+ "\n    plate number : " + plateNumber
				+ "\n    registered   : " + registrationDate
				+ "\n    wheels       : " + wheels
				+ "\n    weight       : " + weight
				+ "\n    cleanings    : " + cleaningCount;
	}
}
