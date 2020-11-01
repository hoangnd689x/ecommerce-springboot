package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Category;

public interface CategoryService {
	List<Category> getAll();

	void save(Category category);

	void update (Long id, Category category);
	
	void delete(Long id);
	
	Optional<Category> findById(Long id);
}
