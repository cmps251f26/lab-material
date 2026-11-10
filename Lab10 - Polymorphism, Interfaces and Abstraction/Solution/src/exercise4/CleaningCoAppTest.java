package exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CleaningCoAppTest {
	public static void main(String[] args) {
		Resident ghanim = new Resident(2571, "Ghanim Salih");
		Unit unit = new Unit("Porto Arabia", 3, "Tower 12", 1204);
		unit.setCleaningCount(4);
		ghanim.setResidence(unit);

		Car camry = new Car("123456", 4, 1500, LocalDate.of(2023, 3, 10), 5, TransmissionType.AUTOMATIC);
		camry.setCleaningCount(6);
		ghanim.addVehicle(camry);
		ghanim.addVehicle(camry);   // duplicate, ignored
		ghanim.addVehicle(null);    // ignored

		Resident saad = new Resident(1318, "Saad Mohamed");
		Villa villa = new Villa("Qanat Quartier", 6, 2);
		villa.setCleaningCount(2);
		saad.setResidence(villa);

		Car patrol = new Car("777001", 4, 2700, LocalDate.of(2022, 8, 1), 7, TransmissionType.AUTOMATIC);
		patrol.setCleaningCount(3);
		Truck volvo = new Truck("88990", 12, 4000, LocalDate.of(2020, 1, 25), 12000);
		volvo.setCleaningCount(2);
		saad.addVehicle(patrol);
		saad.addVehicle(volvo);

		List<Resident> residents = new ArrayList<Resident>();
		residents.add(ghanim);
		residents.add(saad);

		for (Resident resident : residents) {
			System.out.println(resident);

			// Residences and vehicles are both Cleanable, so one variable type handles all of them
			double total = 0;
			Cleanable residence = resident.getResidence();
			if (residence != null)
				total += residence.getCleaningAmount();
			for (Cleanable vehicle : resident.getVehicles())
				total += vehicle.getCleaningAmount();

			System.out.printf("\n  Total cleaning fees: QR %.2f\n\n", total);
		}

		System.out.println("Searching Saad's vehicles for plate 88990:" + saad.getVehicle("88990"));
		saad.deleteVehicle("88990");
		System.out.println("\nAfter deleting 88990, found: " + saad.getVehicle("88990"));
	}
}
