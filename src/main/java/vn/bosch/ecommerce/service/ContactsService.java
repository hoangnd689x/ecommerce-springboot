package vn.bosch.ecommerce.service;

import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.model.request.RequestContactModel;

public interface ContactsService {
    public ContactDto getContact(Long id, RequestContactModel email);
    public ContactDto createContact(ContactDto contact);
    public ContactDto updateContact(ContactDto contact);
    public void deleteContact(Long id);


}
