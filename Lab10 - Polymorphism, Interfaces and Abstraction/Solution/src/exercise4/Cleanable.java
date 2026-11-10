package exercise4;

import java.util.Map;

public interface Cleanable {
	// Fields in an interface are implicitly public static final
	Map<String, Integer> fees = Map.of("Car", 10, "Truck", 15, "Unit", 25, "Villa", 50);

	int getFee(String type);

	void setCleaningCount(int cleaningCount);

	double getCleaningAmount();
}
