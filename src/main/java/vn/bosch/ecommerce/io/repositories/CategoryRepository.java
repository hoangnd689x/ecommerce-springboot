package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
