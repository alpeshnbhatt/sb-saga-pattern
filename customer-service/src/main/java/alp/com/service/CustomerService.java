package alp.com.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import alp.com.entity.Customer;
import alp.com.repository.CustomerRepository;

@Service
public class CustomerService {

	CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Optional<Customer> findCustomer(UUID customerId) {
		return customerRepository.findById(customerId);
	}
}
