package vn.bosch.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
