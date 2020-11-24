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

import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	   ProductService productService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Product product) {
		  productService.save(product);
	      return new ResponseEntity<>("Product is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Product product) {
		  productService.update(id, product);
	      return new ResponseEntity<>("Product is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   productService.delete(id);
	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> getProductById(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
	   }
	   @GetMapping("/view/{view}")
		public ResponseEntity<Object> getProductByView(@PathVariable("view")String view){
	   		return new ResponseEntity<>(productService.getProductByView(view), HttpStatus.OK);
	   }
	   @GetMapping("/review/{id}")
	   public ResponseEntity<Object> getProductReview(@PathVariable("id")Long id) {
		   return new ResponseEntity<>(productService.getProductReview(id), HttpStatus.OK);
	   }
	   @GetMapping("/top10")
	   public ResponseEntity<Object> getTop10Product() {
		   return new ResponseEntity<>(productService.getTop10Product(), HttpStatus.OK);
	   }

}
