package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Resident {
	private int id;
	private String name;
	private Residence residence;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Resident() {
	}

	public Resident(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void addVehicle(Vehicle vehicle) {
		if (vehicle != null && !vehicles.contains(vehicle))
			vehicles.add(vehicle);
	}

	public Vehicle getVehicle(String plateNumber) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getPlateNumber().equals(plateNumber))
				return vehicle;
		}
		return null;
	}

	public void deleteVehicle(String plateNumber) {
		// Removing inside a for-each loop throws ConcurrentModificationException,
		// so find the vehicle first and remove it afterwards
		Vehicle vehicle = getVehicle(plateNumber);
		if (vehicle != null)
			vehicles.remove(vehicle);
	}

	@Override
	public String toString() {
		String result = String.format("Resident %d: %s\n  Residence: %s", id, name, residence);
		result += "\n  Vehicles : " + vehicles.size();
		for (Vehicle vehicle : vehicles)
			result += vehicle;
		return result;
	}
}
