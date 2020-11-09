package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Customer;

public interface CustomerService {
	List<Customer> getAll();

	void save(Customer cust);

	void update (Long id, Customer cust);
	
	void delete(Long id);
	
	Optional<Customer> findById(Long id);
}
