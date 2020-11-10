package vn.bosch.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.io.repositories.ProductRepository;
import vn.bosch.ecommerce.model.response.GetAllProduct;
import vn.bosch.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository productRepository; 
	
	@Override
	public ArrayList<GetAllProduct> getAll() {
		ArrayList<Product> allProduct =  (ArrayList<Product>) productRepository.findAll();
		ArrayList<GetAllProduct> returnValue = new ArrayList<GetAllProduct>();
		for (Product product: allProduct){
			GetAllProduct newItem = new GetAllProduct();
			newItem.setProductName(product.getProductName());
			newItem.setProductImage(product.getProductImage());
			newItem.setBuyPrice(product.getBuyPrice());
			newItem.setCategory(product.getCategoryId());
			returnValue.add(newItem);
		}
		return returnValue;
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
