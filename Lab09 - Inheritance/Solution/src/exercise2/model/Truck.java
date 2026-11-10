package exercise2.model;

public class Truck extends Vehicle {
	private int load;

	public Truck() {
	}

	public Truck(int wheels, int weight, int load) {
		super(wheels, weight);
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
			return 0.0;
		// cast first, otherwise this is integer division
		return (double) (load + getWeight()) / getWheels();
	}

	@Override
	public String getAsCSV() {
		return getWheels() + "," + getWeight() + "," + load + "," + getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n    load        : " + load
				+ String.format("\n    wheel load  : %.2f", getWheelLoad());
	}
}
