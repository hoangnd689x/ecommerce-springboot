package vn.bosch.ecommerce.service.Impl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;
import vn.bosch.ecommerce.io.repositories.RoleRepository;
import vn.bosch.ecommerce.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
    private RoleRepository roleRepository;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	@Override
	public void save(Account account) {
		account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
		accountRepository.save(account);
	}

	@Override
	public void delete(Long id) {
		accountRepository.deleteById(id);
	}

	@Override
	public Optional<Account> findById(Long id) {
		return accountRepository.findById(id);
	}

	@Override
	public void update(Long id, Account account) {
		Optional<Account> existingObj = accountRepository.findById(id);
		if (existingObj.isPresent()) {
			account.setAccountId(id);
			accountRepository.save(account);
		}
	}

	@Override
	public Account findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}
	
	@Override
	public Account findByEmail(String email) {
		return accountRepository.findByEmail(email);
	}

}
