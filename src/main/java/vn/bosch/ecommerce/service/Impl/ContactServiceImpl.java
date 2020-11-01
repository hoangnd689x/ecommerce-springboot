package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Contact;
import vn.bosch.ecommerce.repository.ContactRepository;
import vn.bosch.ecommerce.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired 
	private ContactRepository contactRepository; 
	
	@Override
	public List<Contact> getAll() {
		return (List<Contact>) contactRepository.findAll();
	}

	@Override
	public void save(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public void delete(Long id) {
		contactRepository.deleteById(id);
	}

	@Override
	public Optional<Contact> findById(Long id) {
		return contactRepository.findById(id);
	}

	@Override
	public void update(Long id, Contact contact) {
		Optional<Contact> existingObj = contactRepository.findById(id);
		if(existingObj.isPresent()) {
			contact.setContactId(id);
			contactRepository.save(contact);
		}
	}
}
