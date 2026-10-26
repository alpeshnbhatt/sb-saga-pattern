package alp.com.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alp.com.entity.OrderEntity;
import alp.com.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping
	public void placeOrder(@RequestBody OrderEntity orderRequest) {
		orderService.placeOrder(orderRequest);
	}

	@GetMapping("/test")
	public String helloWord() {
		return "HelloWord" + new Timestamp(new Date().getTime());
	}
}
