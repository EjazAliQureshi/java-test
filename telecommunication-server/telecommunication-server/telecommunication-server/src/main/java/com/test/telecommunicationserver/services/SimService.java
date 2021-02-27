package com.test.telecommunicationserver.services;

import org.springframework.http.ResponseEntity;

import com.test.telecommunicationserver.entity.Sim;

public interface SimService {

	ResponseEntity<Object> createSimService(Sim sim);

	ResponseEntity<Object> getSimService();

}
