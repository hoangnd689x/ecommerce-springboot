package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
