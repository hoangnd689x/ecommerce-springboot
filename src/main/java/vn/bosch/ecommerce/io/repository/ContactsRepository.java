package vn.bosch.ecommerce.io.repository;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.io.entity.Contacts;

public interface ContactsRepository  extends CrudRepository<Contacts, Long> {
    Contacts getContactsByEmail(String email);
}
