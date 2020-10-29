package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

}