package alp.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alp.com.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
