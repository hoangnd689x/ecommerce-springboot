package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Product;

import java.util.ArrayList;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product getProductByProductId(Long id);
    ArrayList<Product> getProductByViewCount(String view);
    ArrayList<Product> findTop10ByOrderByAverageRatingDesc();
}
