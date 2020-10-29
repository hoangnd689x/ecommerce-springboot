package vn.bosch.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.service.AccountService;

@RestController
public class AccountsController {

		@Autowired
	   AccountService accountService;
		
	   @RequestMapping(value = "/accounts")
	   public ResponseEntity<Object> getAccounts() {
	      return new ResponseEntity<>(accountService.getAllAccounts(), HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/account", method = RequestMethod.POST)
	   public ResponseEntity<Object> saveAccount(@RequestBody Account account) {
		  accountService.saveAccount(account);
	      return new ResponseEntity<>("Account is saved successfully", HttpStatus.CREATED);
	   }
	   
	   @RequestMapping(value = "/account/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> deleteAccount(@PathVariable("id") Long id) { 
		   accountService.deleteAccount(id);
	      return new ResponseEntity<>("Account is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
	   public ResponseEntity<Object> getAccount(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(accountService.findAccountById(id), HttpStatus.OK);
	   }
}
