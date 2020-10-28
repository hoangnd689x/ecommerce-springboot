package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.io.entities.Contacts;

public interface ContactsRepository  extends CrudRepository<Contacts, Long> {
    Contacts getContactByEmail(String email);
    Contacts getContactByContactId(Long id);
    Contacts getContactByPhone(String phone);
    void deleteContactByContactId(Long id);
}

