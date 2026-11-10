package exercise2.model;

public class Car extends Vehicle {
	private int passengers;

	public Car() {
	}

	public Car(int wheels, int weight, int passengers) {
		super(wheels, weight);
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	// The class name has to stay last, so we can't just append to super.getAsCSV()
	@Override
	public String getAsCSV() {
		return getWheels() + "," + getWeight() + "," + passengers + "," + getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return super.toString() + "\n    Passengers  : " + passengers;
	}
}
