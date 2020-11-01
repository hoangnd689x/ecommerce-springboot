package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Product;
import vn.bosch.ecommerce.repository.ProductRepository;
import vn.bosch.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository productRepository; 
	
	@Override
	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public void update(Long id, Product product) {
		Optional<Product> existingObj = productRepository.findById(id);
		if(existingObj.isPresent()) {
			product.setProductId(id);
			productRepository.save(product);
		}
	}
}
