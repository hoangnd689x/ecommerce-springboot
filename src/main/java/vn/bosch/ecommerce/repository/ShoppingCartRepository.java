package vn.bosch.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.model.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
	Optional<ShoppingCart> findByProductIdAndCustomerId(Long productId, Long customerId);
}
