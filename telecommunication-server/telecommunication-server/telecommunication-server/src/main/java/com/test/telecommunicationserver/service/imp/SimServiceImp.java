package com.test.telecommunicationserver.service.imp;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.telecommunicationserver.entity.Sim;
import com.test.telecommunicationserver.repository.SimRepository;
import com.test.telecommunicationserver.services.SimService;
import com.test.telecommunicationserver.util.ResponseGenerator;
@Service
public class SimServiceImp implements SimService {

	
	
	@Autowired
	SimRepository simRepository;

// CREATE
	@Override
	public ResponseEntity<Object> createSimService(Sim sim) {
		BeanUtils.copyProperties(sim, sim);
		sim = simRepository.save(sim);

		return ResponseGenerator.jsonResponse(HttpStatus.OK, HttpStatus.OK.getReasonPhrase(), "Sim Added Successfully",
				sim);
	}

// VIEW
	@Override
	public ResponseEntity<Object> getSimService() {
		List<Sim> SimList = simRepository.findAll();
		return ResponseGenerator.jsonResponse(HttpStatus.OK, HttpStatus.OK.getReasonPhrase(), "Sim List",
				SimList);
	}

}
