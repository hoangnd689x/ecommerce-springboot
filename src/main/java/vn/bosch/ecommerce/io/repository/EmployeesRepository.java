package vn.bosch.ecommerce.io.repository;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.dto.EmployeeDto;
import vn.bosch.ecommerce.io.entity.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Long> {
    public EmployeeDto getEmployeesByJobTitle(String jobTitle);
}
