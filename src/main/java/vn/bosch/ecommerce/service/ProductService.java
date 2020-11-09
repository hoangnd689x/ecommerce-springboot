package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Product;

public interface ProductService {
	List<Product> getAll();

	void save(Product product);

	void update (Long id, Product product);
	
	void delete(Long id);
	
	Optional<Product> findById(Long id);

}
