package exercise4;

import java.time.LocalDate;

public class Truck extends Vehicle {
	private int load;

	public Truck() {
	}

	public Truck(String plateNumber, int wheels, int weight, LocalDate registrationDate, int load) {
		super(plateNumber, wheels, weight, registrationDate, 0);
		this.load = load;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	public double getWheelLoad() {
		if (getWheels() == 0)
			return 0;
		return (double) (load + getWeight()) / getWheels();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n    load         : " + load
				+ String.format("\n    wheel load   : %.2f", getWheelLoad());
	}
}
