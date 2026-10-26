package alp.com.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import alp.com.entity.Customer;
import alp.com.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@GetMapping("/{customerId}")
	public Customer findById(@PathVariable("customerId") UUID customerId) {
		Optional<Customer> customer = customerService.findCustomer(customerId);
		return customer.isEmpty() ? new Customer() : customer.get();
	}

	@GetMapping("/test1")
	public String test() {
		return "Tested OK : ";
	}

}
