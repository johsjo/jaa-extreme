package se.coredev.jpa.extreme.repository;

import javax.persistence.EntityManagerFactory;

import se.coredev.jpa.extreme.model.ParkingSpot;

public final class JpaParkingSpotRepository extends AbstractJpaRepository<ParkingSpot>
		implements ParkingSpotRepository {

	public JpaParkingSpotRepository(EntityManagerFactory factory) {
		super(factory, ParkingSpot.class);
	}

}
