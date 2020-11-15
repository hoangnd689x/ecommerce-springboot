package vn.bosch.ecommerce.io.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
	Optional<ShoppingCart> findByProductIdAndCustomerId(Long productId, Long customerId);
}
