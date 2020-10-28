package vn.bosch.ecommerce.service;

import vn.bosch.ecommerce.dto.ContactDto;

public interface ContactsService {
    public ContactDto getContact(String email);
    public ContactDto createContact(ContactDto contact);
    public ContactDto updateContact(ContactDto contact);
    public void deleteContact(Long id);


}
