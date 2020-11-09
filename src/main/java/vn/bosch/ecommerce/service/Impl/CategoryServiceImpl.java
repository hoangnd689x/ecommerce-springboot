package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Category;
import vn.bosch.ecommerce.io.repositories.CategoryRepository;
import vn.bosch.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired 
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public void save(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}

	@Override
	public void update(Long id, Category category) {
		Optional<Category> existingObj = categoryRepository.findById(id);
		if(existingObj.isPresent()) {
			category.setCategoryId(id);
			categoryRepository.save(category);
		}
	}

}
