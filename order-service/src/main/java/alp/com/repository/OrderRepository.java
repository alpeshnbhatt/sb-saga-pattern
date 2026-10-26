package alp.com.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import alp.com.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {

}
