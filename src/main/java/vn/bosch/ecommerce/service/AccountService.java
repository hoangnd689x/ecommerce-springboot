package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.entities.Account;


public interface AccountService {
	List<Account> getAllAccount();

	void saveAccount(Account account);

	void deleteAccount(Long id);

	Optional<Account> findAccountById(Long id);
}
