package vn.bosch.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
