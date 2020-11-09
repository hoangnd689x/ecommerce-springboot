package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Payment;

public interface PaymentService {
	List<Payment> getAll();

	void save(Payment payment);

	void update (Long id, Payment payment);
	
	void delete(Long id);
	
	Optional<Payment> findById(Long id);
}
