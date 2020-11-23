package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import vn.bosch.ecommerce.io.entities.Account;

public interface AccountService {
	List<Account> getAll();

	void save(Account account);
	
	void update(Long id, Account account);

	void delete(Long id);
	
	Optional<Account> findById(Long id);

	ResponseEntity<String> register(String contextPath, String username, String email, String password);

	ResponseEntity<String> verify(String verificationToken);

	ResponseEntity<String> resetPassword(String email, String password);


}
