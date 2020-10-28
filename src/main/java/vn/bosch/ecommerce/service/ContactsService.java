package vn.bosch.ecommerce.service;

import vn.bosch.ecommerce.dto.ContactDto;

public interface ContactsService {
    public ContactDto getContact(String email);
    public ContactDto createContact(ContactDto contact);
    public ContactDto updateContact(ContactDto contact);
//    public ContactDto updateContactFirstName(Long id, String firstName);
//    public ContactDto updateContactLastName(Long id, String LastName);


}
