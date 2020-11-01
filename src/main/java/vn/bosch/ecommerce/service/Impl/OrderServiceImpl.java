package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Order;
import vn.bosch.ecommerce.repository.OrderRepository;
import vn.bosch.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired 
	private OrderRepository orderRepository; 
	
	@Override
	public List<Order> getAll() {
		return (List<Order>) orderRepository.findAll();
	}

	@Override
	public void save(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void delete(Long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public Optional<Order> findById(Long id) {
		return orderRepository.findById(id);
	}

	@Override
	public void update(Long id, Order order) {
		Optional<Order> existingObj = orderRepository.findById(id);
		if(existingObj.isPresent()) {
			order.setOrderId(id);
			orderRepository.save(order);
		}
	}
}
