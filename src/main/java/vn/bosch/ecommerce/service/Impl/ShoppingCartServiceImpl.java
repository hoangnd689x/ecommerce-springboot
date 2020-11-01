package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.ShoppingCart;
import vn.bosch.ecommerce.repository.ShoppingCartRepository;
import vn.bosch.ecommerce.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired 
	private ShoppingCartRepository cartRepository; 
	
	@Override
	public List<ShoppingCart> getAll() {
		return (List<ShoppingCart>) cartRepository.findAll();
	}

	@Override
	public void save(ShoppingCart cart) {
		cartRepository.save(cart);
	}

	@Override
	public void delete(ShoppingCart cart) {
		cartRepository.delete(cart);
	}

	@Override
	public Optional<ShoppingCart> findByProductIdAndCustomerId(Long productId, Long customerId) {
		return cartRepository.findByProductIdAndCustomerId(productId, customerId);
	}

	@Override
	public void update(Long productId, Long customerId, ShoppingCart cart) {
		Optional<ShoppingCart> existingObj = cartRepository.findByProductIdAndCustomerId(productId, customerId);
		if(existingObj.isPresent()) {
			cart.setProductId(productId);
			cart.setCustomerId(customerId);
			cartRepository.save(cart);
		}
	}
	
}
