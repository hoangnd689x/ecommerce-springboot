package vn.bosch.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.model.Invoice;
import vn.bosch.ecommerce.repository.InvoiceRepository;
import vn.bosch.ecommerce.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired 
	private InvoiceRepository invoiceRepository;
	
	@Override
	public List<Invoice> getAll() {
		return (List<Invoice>) invoiceRepository.findAll();
	}

	@Override
	public void save(Invoice line) {
		invoiceRepository.save(line);
	}

	@Override
	public void delete(Long id) {
		invoiceRepository.deleteById(id);
	}

	@Override
	public Optional<Invoice> findById(Long id) {
		return invoiceRepository.findById(id);
	}

	@Override
	public void update(Long id, Invoice invoice) {
		Optional<Invoice> existingObj = invoiceRepository.findById(id);
		if(existingObj.isPresent()) {
			invoice.setInvoiceId(id);
			invoiceRepository.save(invoice);
		}
	}
}
