package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.model.request.RegisterRequestModel;

public interface AccountService extends UserDetailsService {
	List<Account> getAll();

	void register(RegisterRequestModel account);
	
	void update(Long id, Account account);

	void delete(Long id);
	
	Optional<Account> findById(Long id);

	UserDetails loadUserByUsername(String userName);
}
