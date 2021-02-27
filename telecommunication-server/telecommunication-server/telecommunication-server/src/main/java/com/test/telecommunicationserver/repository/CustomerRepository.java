package com.test.telecommunicationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.telecommunicationserver.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
