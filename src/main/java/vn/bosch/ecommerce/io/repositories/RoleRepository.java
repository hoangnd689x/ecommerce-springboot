package vn.bosch.ecommerce.io.repositories;

import org.springframework.data.repository.CrudRepository;
import vn.bosch.ecommerce.io.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role getRoleByRoleId(Long id);
}
