package vn.bosch.ecommerce.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.io.entities.Contacts;
import vn.bosch.ecommerce.io.repositories.ContactsRepository;
import vn.bosch.ecommerce.service.ContactsService;

@Service
public class ContactsServiceImpl implements ContactsService {
    @Autowired
    ContactsRepository repository;

    @Override
    public ContactDto getContact(String email) {
        if (repository.getOneContactByEmail(email) == null) {
            throw new RuntimeException("Contact does not existed");
        } else {
            ContactDto returnValue = new ContactDto();
            BeanUtils.copyProperties(repository.getOneContactByEmail(email), returnValue);
            return returnValue;
        }
    }

    @Override
    public ContactDto createContact(ContactDto contact) {
        if (repository.getOneContactByEmail(contact.getEmail()) != null)
            throw new RuntimeException("Contact already existed");
        if (repository.getOneContactByPhone(contact.getPhone()) != null)
            throw new RuntimeException("Contact already existed");
        Contacts contactEntity = new Contacts();
        BeanUtils.copyProperties(contact, contactEntity);
        Contacts storedContact = repository.save(contactEntity);
        ContactDto returnValue = new ContactDto();
        BeanUtils.copyProperties(storedContact, returnValue);
        return returnValue;
    }

    @Override
    public ContactDto updateContact(ContactDto contact) {
        ContactDto returnValue = new ContactDto();
        ContactDto updatedContact = new ContactDto();
        Contacts existedContact = repository.getOneContactByContactId(contact.getContactId());
        if (existedContact != null) {
            if (contact.getFirstName() != null) {
                updatedContact.setFirstName(contact.getFirstName());
            }else{
                updatedContact.setFirstName(existedContact.getFirstName());
            }
            if (contact.getLastName() != null) {
                updatedContact.setLastName(contact.getLastName());
            }else{
                updatedContact.setLastName(existedContact.getLastName());
            }
            if (contact.getAddressLine() != null) {
                updatedContact.setAddressLine(contact.getAddressLine());
            }else{
                updatedContact.setAddressLine(existedContact.getAddressLine());
            }
            if (contact.getCity() != null) {
                updatedContact.setCity(contact.getCity());
            }
            else{
                updatedContact.setCity(existedContact.getCity());
            }
            if (contact.getWard() != null) {
                updatedContact.setWard(contact.getWard());
            }else{
                updatedContact.setWard(existedContact.getWard());
            }
            if (contact.getEmail() != null) {
                if (!repository.getOneContactByEmail(contact.getEmail()).getContactId().equals(contact.getContactId())) {
                    throw new RuntimeException("Email is already use by other contact");

                } else if (existedContact.getEmail().equals(contact.getEmail())) {
                    throw new RuntimeException("Please input new email");

                } else if (repository.getOneContactByEmail(contact.getEmail()).getContactId().equals(contact.getContactId()) && !existedContact.getEmail().equals(contact.getEmail())) {
                    updatedContact.setEmail(contact.getEmail());
                }
            }
            else{
                updatedContact.setEmail(existedContact.getEmail());
            }
            if (contact.getPhone() != null) {
                if (repository.getOneContactByPhone(contact.getPhone()).getContactId() == contact.getContactId() && existedContact.getPhone() != contact.getPhone()) {
                    updatedContact.setPhone(contact.getPhone());
                } else if (existedContact.getPhone() == contact.getPhone()) {
                    throw new RuntimeException("Please input new phone");
                } else if (repository.getOneContactByPhone(contact.getPhone()).getContactId() != contact.getContactId()) {
                    throw new RuntimeException("Phone is already use by other contact");
                }
            }else{
                updatedContact.setPhone(existedContact.getPhone());
            }
        }else{
            throw new RuntimeException("Contact not found!");
        }
        updatedContact.setContactId(contact.getContactId());
        BeanUtils.copyProperties(updatedContact, existedContact);
        existedContact = repository.save(existedContact);
        BeanUtils.copyProperties(existedContact,returnValue);
        return returnValue;
    }
}
