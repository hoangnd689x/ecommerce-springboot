package vn.bosch.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.model.response.GetAllProduct;

public interface ProductService {
	ArrayList<GetAllProduct> getAll();

	void save(Product product);

	void update (Long id, Product product);
	
	void delete(Long id);
	
	Optional<Product> findById(Long id);

}
