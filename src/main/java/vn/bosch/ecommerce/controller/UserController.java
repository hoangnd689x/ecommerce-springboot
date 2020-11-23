package vn.bosch.ecommerce.controller;

import javax.persistence.PersistenceException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.apache.commons.lang3.StringUtils;
import vn.bosch.ecommerce.config.Constants;
import vn.bosch.ecommerce.config.EUser;
import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.service.AccountService;

@RestController
@EnableWebMvc
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	AccountService accountService;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> register (
			WebRequest request,
			@RequestParam(name = "username") String username, 
			@RequestParam(name = "email") String email, 
			@RequestParam(name = "password") String password) {
		try {
			String contextPatch = request.getContextPath();
			return accountService.register(contextPatch, username, email, password);
		} 
		catch (PersistenceException e) {
			if (e.getCause() instanceof ConstraintViolationException) {
				ConstraintViolationException cve = (ConstraintViolationException) e.getCause();
				String constraintName = cve.getConstraintName();
				if (StringUtils.equals(constraintName, Constants.KEY_UNIQUE_USERNAME)) {
					return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(Constants.KEY_UNIQUE_USERNAME);
				}
				
				if (StringUtils.equals(constraintName, Constants.KEY_UNIQUE_EMAIL)) {
					return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(Constants.KEY_UNIQUE_EMAIL);
				}
				
				if (StringUtils.equals(constraintName, Constants.KEY_UNIQUE_ID)) {
					return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(Constants.KEY_UNIQUE_ID);
				}
			}
			
			throw e;
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Constants.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public ResponseEntity<String> verifyToken (@RequestParam(name = "verificationToken") String verificationToken) {
		return accountService.verify(verificationToken);
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	//@PreAuthorize(value = "hasAnyRole({'user', 'admin', 'super_admin'})")
	public Account getCurrentAccountInfo() {
		Account account = new Account();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		EUser loggedInUser = (EUser) auth.getPrincipal();
		account = loggedInUser.getUserInfo();
		return account;
	}
	
	@RequestMapping(value = "/reset-password", method = RequestMethod.POST)
	public ResponseEntity<String> resetPassword (@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
		return accountService.resetPassword(email, password); 
	}
	
}
