package se.coredev.jpa.extreme.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = { 
		@NamedQuery(name = "Employee.GetAll", query = "select e from Employee e"),
		@NamedQuery(name = "Employee.GetByFirstName", query = "select e from Employee e where e.firstName = :firstName") 
		})
public class Employee extends AbstractEntity {

	private String firstName;
	private String lastName;

	protected Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return getId() + ", " + firstName + ", " + lastName;
	}
}
