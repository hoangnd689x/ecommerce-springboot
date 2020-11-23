package vn.bosch.ecommerce.io.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	Account findByUsername(String username);
	Account findByEmail(String email);
	
	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
	Account findByVerificationToken(String verificationToken);
}