package vn.bosch.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;
import vn.bosch.ecommerce.io.repositories.RoleRepository;
import vn.bosch.ecommerce.model.request.RegisterRequestModel;
import vn.bosch.ecommerce.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired 
	private AccountRepository accountRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<Account> getAll() {
		return (List<Account>) accountRepository.findAll();
	}

	@Override
	public void register(RegisterRequestModel account) {
		if(this.loadUserByUsername(account.getUserName()) != null){
			throw new RuntimeException("Account already existed");
		}
		Account newAccount = new Account();
		newAccount.setUserName(account.getUserName());
		newAccount.setEmail(account.getEmail());
		newAccount.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
		newAccount.setRoleId(roleRepository.getRoleByRoleId(account.getRoleId()));
		newAccount.setCreatedDate(new Date());
		newAccount.setModifiedDate(new Date());
		newAccount.setDeleted(false);
		accountRepository.save(newAccount);
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
		if(existingObj.isPresent()) {
			account.setAccountId(id);
			accountRepository.save(account);
		}
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Account account = accountRepository.getAccountByUserName(userName);
		if(account == null){
			throw new UsernameNotFoundException("Khong ton tai nhe tim cai :poop:");
		}
		return new User(account.getUserName(), account.getPassword(), new ArrayList<>());
	}
}