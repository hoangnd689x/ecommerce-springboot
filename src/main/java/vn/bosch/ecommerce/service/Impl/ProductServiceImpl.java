package vn.bosch.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.io.entities.ProductReview;
import vn.bosch.ecommerce.io.repositories.ProductRepository;
import vn.bosch.ecommerce.model.response.GetAllProductModel;
import vn.bosch.ecommerce.model.response.GetProductByIdModel;
import vn.bosch.ecommerce.model.response.GetProductReviewModel;
import vn.bosch.ecommerce.model.response.GetProductsByViewModel;
import vn.bosch.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository productRepository; 
	
	@Override
	public ArrayList<GetAllProductModel> getAll() {
		ArrayList<Product> allProduct = (ArrayList<Product>) productRepository.findAll();
		ArrayList<GetAllProductModel> returnValue = new ArrayList<GetAllProductModel>();
		for (Product product: allProduct){
			GetAllProductModel temp = new GetAllProductModel();
			temp.setCategory(product.getCategory().getCategoryName());
			temp.setProductImage(product.getProductImage());
			temp.setPrice(product.getBuyPrice());
			temp.setProductName(product.getProductName());
			temp.setAverageRating(product.getAverageRating());
			returnValue.add(temp);
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
	public GetProductByIdModel getProductById(Long id) {
		Product existedProduct = productRepository.getProductByProductId(id);
		int currentCount = Integer.parseInt(existedProduct.getViewCount());
		currentCount+=1;
		String newCount = Integer.toString(currentCount);
		existedProduct.setViewCount(newCount);
		productRepository.save(existedProduct);
		GetProductByIdModel returnValue= new GetProductByIdModel();
		returnValue.setAverageRating(existedProduct.getAverageRating());
		returnValue.setCategoryName(existedProduct.getCategory().getCategoryName());
		returnValue.setProductImage(existedProduct.getProductImage());
		returnValue.setProductName(existedProduct.getProductName());
		returnValue.setPrice(existedProduct.getBuyPrice());
		return returnValue;
	}

	@Override
	public void update(Long id, Product product) {
		Optional<Product> existingObj = productRepository.findById(id);
		if(existingObj.isPresent()) {
			product.setProductId(id);
			productRepository.save(product);
		}
	}
	@Override
	public ArrayList<GetProductsByViewModel> getProductByView(String view) {
		ArrayList<Product> allProduct = (ArrayList<Product>) productRepository.getProductByViewCount(view);
		ArrayList<GetProductsByViewModel> returnValue = new ArrayList<GetProductsByViewModel>();
		for (Product product: allProduct){
			GetProductsByViewModel productModel = new GetProductsByViewModel();
			productModel.setCategory(product.getCategory().getCategoryName());
			productModel.setProductImage(product.getProductImage());
			productModel.setPrice(product.getBuyPrice());
			productModel.setProductName(product.getProductName());
			productModel.setNumOfView(product.getViewCount());
			returnValue.add(productModel);
		}
		return returnValue;
	}

	@Override
	public ArrayList<GetProductReviewModel> getProductReview(Long id){
		Product existedProduct = productRepository.getProductByProductId(id);
		ArrayList<ProductReview> reviews = new ArrayList<>(existedProduct.getReviews());
		ArrayList<GetProductReviewModel> returnValue = new ArrayList<GetProductReviewModel>();
		for(ProductReview review: reviews){
			GetProductReviewModel temp = new GetProductReviewModel();
			temp.setDate(review.getCreatedDate());
			temp.setProductImage(existedProduct.getProductImage());
			temp.setProductName(existedProduct.getProductName());
			temp.setContent(review.getContent());
			returnValue.add(temp);
		}
		return returnValue;
	}
	@Override
	public ArrayList<GetAllProductModel> getTop10Product(){
		ArrayList<GetAllProductModel> returnValue = new ArrayList<GetAllProductModel>();
		ArrayList<Product> top10 = productRepository.findTop10ByOrderByAverageRatingDesc();
		for(Product product: top10){
			GetAllProductModel temp = new GetAllProductModel();
			temp.setAverageRating(product.getAverageRating());
			temp.setProductName(product.getProductName());
			temp.setProductImage(product.getProductImage());
			temp.setPrice(product.getBuyPrice());
			temp.setCategory(product.getCategory().getCategoryName());
			returnValue.add(temp);
		}
		return returnValue;
	}
}
