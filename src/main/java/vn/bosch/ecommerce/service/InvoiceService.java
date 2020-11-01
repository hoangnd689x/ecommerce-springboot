package vn.bosch.ecommerce.service;

import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.model.Invoice;

public interface InvoiceService {
	List<Invoice> getAll();

	void save(Invoice line);

	void update (Long id, Invoice line);
	
	void delete(Long id);
	
	Optional<Invoice> findById(Long id);
}
