package vn.bosch.ecommerce.service;

import java.util.ArrayList;

import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.model.response.GetAllProductModel;
import vn.bosch.ecommerce.model.response.GetProductByIdModel;
import vn.bosch.ecommerce.model.response.GetProductReviewModel;
import vn.bosch.ecommerce.model.response.GetProductsByViewModel;

public interface ProductService {
	ArrayList<GetAllProductModel> getAll();

	void save(Product product);

	void update (Long id, Product product);
	
	void delete(Long id);
	
	GetProductByIdModel getProductById(Long id);

	ArrayList<GetProductsByViewModel> getProductByView(String view);

	ArrayList<GetProductReviewModel> getProductReview(Long id);

	ArrayList<GetAllProductModel> getTop10Product();

}
