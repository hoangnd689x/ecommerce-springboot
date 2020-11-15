package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Payment;
@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
