package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Account;

public interface AccountService {
	List<Account> getAll();

	void save(Account account);
	
	void update(Long id, Account account);

	void delete(Long id);
	
	Optional<Account> findById(Long id);
}
