package se.coredev.jpa.extreme;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import se.coredev.jpa.extreme.model.Employee;
import se.coredev.jpa.extreme.model.ParkingSpot;
import se.coredev.jpa.extreme.repository.EmployeeRepository;
import se.coredev.jpa.extreme.repository.JpaEmployeeRepository;
import se.coredev.jpa.extreme.repository.JpaParkingSpotRepository;
import se.coredev.jpa.extreme.repository.ParkingSpotRepository;

public final class Main {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("PersistenceUnit");

	public static void main(String[] args) {
		ParkingSpotRepository repository = new JpaParkingSpotRepository(FACTORY);
		
		ParkingSpot parkingSpot = repository.saveOrUpdate(new ParkingSpot("a-54"));
		System.out.println(parkingSpot);
	}
}
