package se.coredev.jpa.extreme.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import static java.util.function.Function.*;

import se.coredev.jpa.extreme.model.Employee;

public final class JpaEmployeeRepository extends AbstractJpaRepository<Employee> implements EmployeeRepository {

	public JpaEmployeeRepository(EntityManagerFactory factory) {
		super(factory, Employee.class);
	}

	@Override
	public List<Employee> getAll() {
		return query("Employee.GetAll", identity());
	}

	@Override
	public List<Employee> getByFirstName(String firstName) {
		return query("Employee.GetByFirstName", query -> query.setParameter("firstName", firstName));
	}

}
