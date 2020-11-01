package vn.bosch.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.model.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
