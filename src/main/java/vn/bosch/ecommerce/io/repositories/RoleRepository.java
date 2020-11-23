package vn.bosch.ecommerce.io.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.bosch.ecommerce.io.entities.Role;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long>{
	Role findByName(String name);
}