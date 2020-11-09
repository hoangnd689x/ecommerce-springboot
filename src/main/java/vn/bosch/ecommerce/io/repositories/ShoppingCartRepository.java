package vn.bosch.ecommerce.io.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	Optional<ShoppingCart> findByProductIdAndCustomerId(Long productId, Long customerId);
}
