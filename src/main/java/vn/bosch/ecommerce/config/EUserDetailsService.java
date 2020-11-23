package vn.bosch.ecommerce.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.repositories.AccountRepository;

public class EUserDetailsService  implements UserDetailsService {
	AccountRepository userRepo;

	public EUserDetailsService(AccountRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = userRepo.findByUsername(username);
		if (account != null) {
			return new EUser(account.getUserName(), account.getPassword(), !account.isDeleted(), getAuthorities(account), account);
		}
		throw new UsernameNotFoundException(username);
	}

	private Set<GrantedAuthority> getAuthorities(Account account) {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(account.getRole().getName());
		authorities.add(grantedAuthority);
		return authorities;
	}

}
