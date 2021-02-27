package com.test.telecommunicationserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.telecommunicationserver.entity.Sim;

import com.test.telecommunicationserver.services.SimService;
import com.test.telecommunicationserver.util.AppConstantUtil;

@RestController
public class SimController {

	@Autowired
	SimService simService;
	
	// CREATE Sim
		@PostMapping(value = AppConstantUtil.SIM + AppConstantUtil.CREATE_URL, headers = AppConstantUtil.HEADERS_VALUE)
		public ResponseEntity<Object> createSim(@RequestBody Sim sim) {
			return simService.createSimService(sim);
		}

	// VIEW Sim
		@GetMapping(value = AppConstantUtil.SIM + AppConstantUtil.VIEW_URL, headers = AppConstantUtil.HEADERS_VALUE)
		public ResponseEntity<Object> getSim() {
			return simService.getSimService();
		}
		
}
