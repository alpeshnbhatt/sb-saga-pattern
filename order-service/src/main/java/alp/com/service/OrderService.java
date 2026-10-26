package alp.com.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import alp.com.entity.OrderEntity;
import alp.com.entity.OrderStatus;
import alp.com.repository.OrderRepository;

@Service
public class OrderService {

	private OrderRepository orderRepository;

	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public void placeOrder(OrderEntity orderRequest) {

		OrderEntity order = new OrderEntity();
		order.setCreatedAt(Timestamp.from(Instant.now()));
		order.setStatus(OrderStatus.PENDING);
		order.setId(UUID.randomUUID());
		this.orderRepository.save(orderRequest);

	}

	void updateOrderStatus(UUID orderId, boolean success) {
		Optional<OrderEntity> orderEntity = this.orderRepository.findById(orderId);

		if (orderEntity.isPresent()) {
			if (success) {
				orderEntity.get().setStatus(OrderStatus.COMPLETED);
			} else {
				orderEntity.get().setStatus(OrderStatus.CANCELED);
			}
			orderRepository.save(orderEntity.get());
		}
	}
}
