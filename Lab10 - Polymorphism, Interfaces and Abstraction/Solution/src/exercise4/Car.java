package exercise4;

import java.time.LocalDate;

public class Car extends Vehicle {
	private int passengers;
	private TransmissionType transmission;

	public Car() {
	}

	// A new car starts with no cleanings; use setCleaningCount() to record them
	public Car(String plateNumber, int wheels, int weight, LocalDate registrationDate,
			int passengers, TransmissionType transmission) {
		super(plateNumber, wheels, weight, registrationDate, 0);
		this.passengers = passengers;
		this.transmission = transmission;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public TransmissionType getTransmission() {
		return transmission;
	}

	public void setTransmission(TransmissionType transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n    passengers   : " + passengers
				+ "\n    transmission : " + transmission;
	}
}
