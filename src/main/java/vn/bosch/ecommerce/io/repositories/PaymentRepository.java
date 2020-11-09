package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
