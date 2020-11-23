package vn.bosch.ecommerce.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import vn.bosch.ecommerce.io.entities.Account;

public class EUser implements UserDetails {
	private static final long serialVersionUID = -3005063323213820420L;

	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	private boolean active;

	private Account userInfo;

	public EUser() {
	}

	public EUser(String username, String password, boolean active, Collection<? extends GrantedAuthority> authorities,
			Account userInfo) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
		this.authorities = authorities;
		this.userInfo = userInfo;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return active;
	}

	public Account getUserInfo() {
		return userInfo;
	}
}
