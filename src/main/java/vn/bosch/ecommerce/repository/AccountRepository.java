package vn.bosch.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}