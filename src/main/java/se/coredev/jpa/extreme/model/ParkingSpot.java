package se.coredev.jpa.extreme.model;

import javax.persistence.Entity;

@Entity
public class ParkingSpot extends AbstractEntity {

	private String label;

	protected ParkingSpot() {
	}

	public ParkingSpot(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return getId() + ", " + label;
	}
}
