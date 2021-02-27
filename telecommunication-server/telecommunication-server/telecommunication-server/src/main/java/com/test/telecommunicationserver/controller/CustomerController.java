package com.test.telecommunicationserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.telecommunicationserver.entity.Customer;
import com.test.telecommunicationserver.services.CustomerService;
import com.test.telecommunicationserver.util.AppConstantUtil;
@RestController
//@RequestMapping("api/")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	// CREATE Customer
		@PostMapping(value = AppConstantUtil.CUSTOMER + AppConstantUtil.CREATE_URL, headers = AppConstantUtil.HEADERS_VALUE)
		public ResponseEntity<Object> createCustomer(@RequestBody Customer customer) {
			return customerService.createCustomerService(customer);
		}

	// VIEW Customer
		@GetMapping(value = AppConstantUtil.CUSTOMER + AppConstantUtil.VIEW_URL, headers = AppConstantUtil.HEADERS_VALUE)
		public ResponseEntity<Object> getCustomer() {
			return customerService.getCustomerService();
		}
}
