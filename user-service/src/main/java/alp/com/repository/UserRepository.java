package alp.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alp.com.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
