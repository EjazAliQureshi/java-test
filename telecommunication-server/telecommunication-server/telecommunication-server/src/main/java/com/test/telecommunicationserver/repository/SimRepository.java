package com.test.telecommunicationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.telecommunicationserver.entity.Sim;
@Repository
public interface SimRepository extends JpaRepository<Sim, Long> {

}
