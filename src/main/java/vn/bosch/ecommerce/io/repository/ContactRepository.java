package vn.bosch.ecommerce.io.repository;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.io.entity.ContactEntity;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer> {
    ContactEntity getContactByEmail(String email);
}
