package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Contact;

public interface ContactService {
	List<Contact> getAll();

	void save(Contact contact);
	
	void update (Long id, Contact contact);
	
	void delete(Long id);
	
	Optional<Contact> findById(Long id);
}
