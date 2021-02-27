package com.test.telecommunicationserver.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "sim")
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sim_seq")
	@SequenceGenerator(name = "sim_seq", sequenceName = "sim_seq", allocationSize = 1)
	private Long serSimId;
	private String txtSimName;
	private String txtSimNumber;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Long getSerSimId() {
		return serSimId;
	}

	public void setSerSimId(Long serSimId) {
		this.serSimId = serSimId;
	}

	public String getTxtSimName() {
		return txtSimName;
	}

	public void setTxtSimName(String txtSimName) {
		this.txtSimName = txtSimName;
	}

	public String getTxtSimNumber() {
		return txtSimNumber;
	}

	public void setTxtSimNumber(String txtSimNumber) {
		this.txtSimNumber = txtSimNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




}

	

	
	



	


