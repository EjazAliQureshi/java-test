package com.test.telecommunicationserver.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
	@SequenceGenerator(name = "customer_seq", sequenceName = "customer_seq", allocationSize = 1)
	private Long serCustomerId;
	private String txtName;
	private String txtMobileNumber;
	private String txtCnic;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sim> sim;

	public Long getSerCustomerId() {
		return serCustomerId;
	}

	public void setSerCustomerId(Long serCustomerId) {
		this.serCustomerId = serCustomerId;
	}

	public String getTxtName() {
		return txtName;
	}

	public void setTxtName(String txtName) {
		this.txtName = txtName;
	}

	public String getTxtMobileNumber() {
		return txtMobileNumber;
	}

	public void setTxtMobileNumber(String txtMobileNumber) {
		this.txtMobileNumber = txtMobileNumber;
	}

	public String getTxtCnic() {
		return txtCnic;
	}

	public void setTxtCnic(String txtCnic) {
		this.txtCnic = txtCnic;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	




	
	}



	

