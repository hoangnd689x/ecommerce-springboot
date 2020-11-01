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

import vn.bosch.ecommerce.model.Order;
import vn.bosch.ecommerce.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	@Autowired
	   OrderService orderService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Order order) {
		  orderService.save(order);
	      return new ResponseEntity<>("Order is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Order order) {
		  orderService.update(id, order);
	      return new ResponseEntity<>("Order is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   orderService.delete(id);
	      return new ResponseEntity<>("Order is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(orderService.findById(id), HttpStatus.OK);
	   }
}
