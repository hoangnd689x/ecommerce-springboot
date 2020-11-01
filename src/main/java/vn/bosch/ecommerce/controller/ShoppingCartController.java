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

import vn.bosch.ecommerce.model.ShoppingCart;
import vn.bosch.ecommerce.service.ShoppingCartService;

@RestController
@RequestMapping("/api/shoppingCart")
public class ShoppingCartController {
	@Autowired
	   ShoppingCartService shoppingCartService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(shoppingCartService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody ShoppingCart shoppingCart) {
		  shoppingCartService.save(shoppingCart);
	      return new ResponseEntity<>("ShoppingCart is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("productId") Long productId, @PathVariable("customerId") Long customerId, @RequestBody ShoppingCart shoppingCart) {
		  shoppingCartService.update(productId, customerId, shoppingCart);
	      return new ResponseEntity<>("ShoppingCart is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@RequestBody ShoppingCart shoppingCart) { 
		   shoppingCartService.delete(shoppingCart);
	      return new ResponseEntity<>("ShoppingCart is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("productId") Long productId, @PathVariable("customerId") Long customerId) {
	      return new ResponseEntity<>(shoppingCartService.findByProductIdAndCustomerId(productId, customerId), HttpStatus.OK);
	   }
}
