package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;
import vn.bosch.ecommerce.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired 
	private AccountRepository accountRepository; 
	
	@Override
	public List<Account> getAllAccounts() {
		return (List<Account>) accountRepository.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		accountRepository.save(account);
	}

	@Override
	public void deleteAccount(Long id) {
		accountRepository.deleteById(id);  
	}

	@Override
	public Optional<Account> findAccountById(Long id) {
		return accountRepository.findById(id);  
	}
	  
}