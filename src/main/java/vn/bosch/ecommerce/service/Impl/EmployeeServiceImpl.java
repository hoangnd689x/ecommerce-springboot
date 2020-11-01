package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Employee;
import vn.bosch.ecommerce.repository.EmployeeRepository;
import vn.bosch.ecommerce.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	private EmployeeRepository employeeRepository; 
	
	@Override
	public List<Employee> getAll() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void update(Long id, Employee employee) {
		Optional<Employee> existingObj = employeeRepository.findById(id);
		if(existingObj.isPresent()) {
			employee.setEmployeeId(id);
			employeeRepository.save(employee);
		}
	}
}
