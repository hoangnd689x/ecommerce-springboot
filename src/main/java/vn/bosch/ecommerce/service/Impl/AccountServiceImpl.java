package vn.bosch.ecommerce.service.Impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.config.Constants;
import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;
import vn.bosch.ecommerce.io.repositories.RoleRepository;
import vn.bosch.ecommerce.service.AccountService;
import vn.bosch.ecommerce.service.EmailService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
    private RoleRepository roleRepo;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	EmailService emailService;

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
	@Transactional
	public ResponseEntity<String> register (String contextPath, String username, String email, 
			String password) {
		try {
			PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(16);

			Account user = new Account();
			user.setUserName(username);
			user.setEmail(email);
			user.setPassword(passwordEncoder.encode(password));
			user.setDeleted(true);
			user.setRole(roleRepo.findByName("user"));
			System.out.println(roleRepo.findByName("user").getName() + "line 79");
			if (accountRepository.existsByUsername(user.getUserName())) {
				return ResponseEntity
						.badRequest()
						.body("Error: Username is already taken!");
			}

			if (accountRepository.existsByEmail(user.getEmail())) {
				return ResponseEntity
						.badRequest()
						.body("Error: Email is already in use!");
			}
			System.out.println(user + "line 80");
			String verificationToken = makeRandomKey(50);
			user.setVerificationToken(verificationToken);
			System.out.println(user + "line 83");
			accountRepository.save(user);
			System.out.println("oke line 84");
			String validationLink = "http://localhost:8080/user/verify/" + verificationToken; 
			System.out.println(validationLink +" oke line 103");
	        /*emailService.sendMail(email, "Email address confirmation", 
        		"Dear " + username + ",\n\n" + 
	        		"Please click on the following link to confirm that this is your e-mail address. \n\n" +
	        		validationLink + "\n\n" +
	        		"Regards," + "\n" +
	        		"Backend Team");*/
	        System.out.println("oke line 110");
			return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
		} catch (Exception e) {
			throw e;
		}
	}
	
	@Override
	@Transactional
	public ResponseEntity<String> verify (String verificationToken) {
		try {
			Account user = accountRepository.findByVerificationToken(verificationToken);
			
			if (user == null) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wrong Token");
			}
			else {
				user.setVerificationToken(null);
				
				if (user.isDeleted()) {
					user.setDeleted(false);
				}
				
			}
			
			accountRepository.save(user);
			
			return ResponseEntity.status(HttpStatus.OK).body("Activate successfully");
		}
		catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Constants.NOT_FOUND);
		}
	}
	
	public String makeRandomKey(int length) {
		String text = "";
		String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		for (int i = 0; i < length; ++i) {
			text += possible.charAt((int)Math.floor(Math.random() * possible.length()));
		}
		System.out.println("Random Pass id: " + text);
		
		return text;
	}

}
