package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Employee;

public interface EmployeeService {
	List<Employee> getAll();

	void save(Employee emp);

	void update (Long id, Employee emp);
	
	void delete(Long id);
	
	Optional<Employee> findById(Long id);
}
