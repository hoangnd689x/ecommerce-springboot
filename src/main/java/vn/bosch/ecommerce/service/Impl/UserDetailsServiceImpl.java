package vn.bosch.ecommerce.service.Impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired AccountRepository accountRepository;
    
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(username);
        if (account == null) {
        	account = accountRepository.findByEmail(username);
        	if (account == null) {
        		throw new UsernameNotFoundException("Invalid username or password.");
        	}
        }
        
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        grantedAuthorities.add(new SimpleGrantedAuthority(account.getRole().getRoleName()));
        
        return new org.springframework.security.core.userdetails.User(account.getUserName(),
        	account.getPassword(),
        	grantedAuthorities);
    }

}
