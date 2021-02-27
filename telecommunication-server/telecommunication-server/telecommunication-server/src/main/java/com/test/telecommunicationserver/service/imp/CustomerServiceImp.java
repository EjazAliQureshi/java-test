package com.test.telecommunicationserver.service.imp;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.telecommunicationserver.entity.Customer;
import com.test.telecommunicationserver.repository.CustomerRepository;
import com.test.telecommunicationserver.services.CustomerService;
import com.test.telecommunicationserver.util.ResponseGenerator;
@Service
public class CustomerServiceImp implements CustomerService {

	
	@Autowired
	CustomerRepository customerRepository;

// CREATE
	@Override
	public ResponseEntity<Object> createCustomerService(Customer customer) {
		BeanUtils.copyProperties(customer, customer);
		customer = customerRepository.save(customer);

		return ResponseGenerator.jsonResponse(HttpStatus.OK, HttpStatus.OK.getReasonPhrase(), "Customer Added Successfully",
				customer);
	}

// VIEW
	@Override
	public ResponseEntity<Object> getCustomerService() {
		List<Customer> customerList = customerRepository.findAll();
		return ResponseGenerator.jsonResponse(HttpStatus.OK, HttpStatus.OK.getReasonPhrase(), "Customer List",
				customerList);
	}
	
}
