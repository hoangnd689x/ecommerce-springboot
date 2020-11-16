package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import vn.bosch.ecommerce.io.entities.Account;

public interface AccountService {
	List<Account> getAll();

	void save(Account account);
	
	void update(Long id, Account account);

	void delete(Long id);
	
	Optional<Account> findById(Long id);
	
	Account findByUsername(String username);

	Account findByEmail(String email);


}
