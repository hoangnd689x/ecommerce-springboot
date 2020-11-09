package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
