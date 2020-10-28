package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.dto.EmployeeDto;
import vn.bosch.ecommerce.io.entities.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Long> {
    public EmployeeDto getEmployeesByJobTitle(String jobTitle);
}
