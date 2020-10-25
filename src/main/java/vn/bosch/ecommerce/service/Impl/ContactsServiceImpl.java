package vn.bosch.ecommerce.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.io.entity.Contacts;
import vn.bosch.ecommerce.io.repository.ContactsRepository;
import vn.bosch.ecommerce.service.ContactsService;

@Service
public class ContactsServiceImpl implements ContactsService {
    @Autowired
    ContactsRepository repository;
    @Override
    public ContactDto getContact(String email) {
        if(repository.getContactsByEmail(email) == null) {
            throw new RuntimeException("Contact does not existed");
        } else {
            ContactDto returnValue = new ContactDto();
            BeanUtils.copyProperties(repository.getContactsByEmail(email),returnValue);
            return returnValue;
        }
    }

    @Override
    public ContactDto createContact(ContactDto contact){
        if(repository.getContactsByEmail(contact.getEmail()) != null) throw new RuntimeException("Contact already existed");
        Contacts contactEntity = new Contacts();
        BeanUtils.copyProperties(contact,contactEntity);
        Contacts storedContact = repository.save(contactEntity);
        ContactDto returnValue = new ContactDto();
        BeanUtils.copyProperties(storedContact, returnValue);
        return returnValue;
    }
}
