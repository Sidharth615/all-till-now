package com.deloitte.estore.model;

public class Order {
	
	private int orderId;
	private Product product;
	private Seller seller;
	private Customer customer;
	
	Order()
	{
		
	}
	public Order(int orderId, Product product, Seller seller, Customer customer) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.seller = seller;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", seller=" + seller + ", customer=" + customer
				+ "]";
	}
	
	
	
	

}
