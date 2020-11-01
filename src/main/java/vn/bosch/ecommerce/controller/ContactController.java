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

import vn.bosch.ecommerce.model.Contact;
import vn.bosch.ecommerce.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	@Autowired
	   ContactService contactService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(contactService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Contact contact) {
		  contactService.save(contact);
	      return new ResponseEntity<>("Contact is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Contact contact) {
		  contactService.update(id, contact);
	      return new ResponseEntity<>("Contact is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   contactService.delete(id);
	      return new ResponseEntity<>("Contact is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(contactService.findById(id), HttpStatus.OK);
	   }
}
