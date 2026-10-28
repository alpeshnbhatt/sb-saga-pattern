package alp.com.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import alp.com.entity.CustomerEntity;
import alp.com.repository.CustomerRepository;

@Service
public class CustomerService {

	CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerEntity createCustomer(CustomerEntity customer) {
		return customerRepository.save(customer);
	}

	public Optional<CustomerEntity> findCustomer(UUID customerId) {
		return customerRepository.findById(customerId);
	}
}
