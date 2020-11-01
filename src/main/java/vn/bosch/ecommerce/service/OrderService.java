package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Order;

public interface OrderService {
	List<Order> getAll();

	void save(Order order);

	void update (Long id, Order order);
	
	void delete(Long id);
	
	Optional<Order> findById(Long id);
}
