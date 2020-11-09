package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getProductByProductId(Long id);
}
