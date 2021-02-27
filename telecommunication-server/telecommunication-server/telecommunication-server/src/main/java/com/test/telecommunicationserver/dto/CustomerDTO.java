package com.test.telecommunicationserver.dto;


public class CustomerDTO {
	private Long serCustomerId;
	private String txtName;
	private String txtMobileNumber;
	private String txtCnic;
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
	
	
}
