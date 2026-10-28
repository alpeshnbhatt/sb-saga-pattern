package alp.com.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import alp.com.entity.CustomerEntity;
import alp.com.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
		return customerService.createCustomer(customer);
	}

	@GetMapping("/{customerId}")
	public CustomerEntity findById(@PathVariable("customerId") UUID customerId) {
		Optional<CustomerEntity> customer = customerService.findCustomer(customerId);
		return customer.isEmpty() ? new CustomerEntity() : customer.get();
	}

	@GetMapping("/test1")
	public String test() {
		return "Tested OK : ";
	}

}
