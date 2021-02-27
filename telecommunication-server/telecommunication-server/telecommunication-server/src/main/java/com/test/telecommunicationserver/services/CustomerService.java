package com.test.telecommunicationserver.services;

import org.springframework.http.ResponseEntity;

import com.test.telecommunicationserver.entity.Customer;

public interface CustomerService {

	ResponseEntity<Object> createCustomerService(Customer customer);

	ResponseEntity<Object> getCustomerService();

}
