package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Payment;
import vn.bosch.ecommerce.repository.PaymentRepository;
import vn.bosch.ecommerce.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired 
	private PaymentRepository paymentRepository; 
	
	@Override
	public List<Payment> getAll() {
		return (List<Payment>) paymentRepository.findAll();
	}

	@Override
	public void save(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public void delete(Long id) {
		paymentRepository.deleteById(id);		
	}

	@Override
	public Optional<Payment> findById(Long id) {
		return paymentRepository.findById(id);
	}

	@Override
	public void update(Long id, Payment payment) {
		Optional<Payment> existingObj = paymentRepository.findById(id);
		if(existingObj.isPresent()) {
			payment.setPaymentId(id);
			paymentRepository.save(payment);
		}
	}
}
