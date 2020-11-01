package vn.bosch.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.bosch.ecommerce.model.Payment;
import vn.bosch.ecommerce.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	@Autowired
	   PaymentService paymentService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(paymentService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Payment payment) {
		  paymentService.save(payment);
	      return new ResponseEntity<>("Payment is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Payment payment) {
		  paymentService.update(id, payment);
	      return new ResponseEntity<>("Payment is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   paymentService.delete(id);
	      return new ResponseEntity<>("Payment is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(paymentService.findById(id), HttpStatus.OK);
	   }
}
