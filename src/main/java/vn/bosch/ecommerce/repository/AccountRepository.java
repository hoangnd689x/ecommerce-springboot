package vn.bosch.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}