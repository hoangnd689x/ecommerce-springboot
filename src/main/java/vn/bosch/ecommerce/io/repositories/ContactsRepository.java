package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.io.entities.Contacts;

public interface ContactsRepository  extends CrudRepository<Contacts, Long> {
    Contacts getOneContactByEmail(String email);
    Contacts getOneContactByContactId(Long id);
    Contacts getOneContactByPhone(String phone);
}

