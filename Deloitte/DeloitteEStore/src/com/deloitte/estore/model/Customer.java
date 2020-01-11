package com.deloitte.estore.model;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerLoc;
	
	Customer()
	{
		
	}
	public Customer(int customerId, String customerName, String customerLoc) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLoc = customerLoc;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLoc() {
		return customerLoc;
	}
	public void setCustomerLoc(String customerLoc) {
		this.customerLoc = customerLoc;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerLoc=" + customerLoc
				+ "]";
	}
	
	

}
