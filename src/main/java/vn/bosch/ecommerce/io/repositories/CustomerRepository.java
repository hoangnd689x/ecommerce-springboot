package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Customer getCustomerByCustomerId(Long id);
}
