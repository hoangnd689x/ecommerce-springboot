package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Customer;
import vn.bosch.ecommerce.repository.CustomerRepository;
import vn.bosch.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired 
	private CustomerRepository customerRepository; 
	
	@Override
	public List<Customer> getAll() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public void save(Customer cust) {
		customerRepository.save(cust);
	}

	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
	}

	@Override
	public Optional<Customer> findById(Long id) {
		return customerRepository.findById(id);
	}

	@Override
	public void update(Long id, Customer customer) {
		Optional<Customer> existingObj = customerRepository.findById(id);
		if(existingObj.isPresent()) {
			customer.setCustomerId(id);
			customerRepository.save(customer);
		}
	}
}
