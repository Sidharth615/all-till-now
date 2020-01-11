package com.deloitte.estore.model;

public class Seller {

	private int sellerId;
	private String sellerName;
	private String sellerLoc;
	
	Seller()
	{
		
	}
	
	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerLoc() {
		return sellerLoc;
	}

	public void setSellerLoc(String sellerLoc) {
		this.sellerLoc = sellerLoc;
	}

	public Seller(int sellerId, String sellerName, String sellerLoc) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerLoc = sellerLoc;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerLoc=" + sellerLoc + "]";
	}
	
	
	
	
}
