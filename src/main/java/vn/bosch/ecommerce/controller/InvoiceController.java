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

import vn.bosch.ecommerce.model.Invoice;
import vn.bosch.ecommerce.service.InvoiceService;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
	@Autowired
	   InvoiceService invoiceService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(invoiceService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Invoice invoice) {
		  invoiceService.save(invoice);
	      return new ResponseEntity<>("Invoice is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Invoice invoice) {
		  invoiceService.update(id, invoice);
	      return new ResponseEntity<>("Invoice is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   invoiceService.delete(id);
	      return new ResponseEntity<>("Invoice is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(invoiceService.findById(id), HttpStatus.OK);
	   }
}
