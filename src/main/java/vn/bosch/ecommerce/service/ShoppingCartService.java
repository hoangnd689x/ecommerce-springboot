package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.ShoppingCart;

public interface ShoppingCartService {
	List<ShoppingCart> getAll();

	void save(ShoppingCart cart);

	void update(Long productId, Long customerId, ShoppingCart cart);

	void delete(ShoppingCart cart);
	
	Optional<ShoppingCart> findByProductIdAndCustomerId(Long productId, Long customerId);
}
