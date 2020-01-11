package com.deloitte.estore.repo;

import java.util.List;

import com.deloitte.estore.model.Seller;



public interface SellerRepo {

	boolean addSeller(Seller seller) throws Exception;
	boolean deleteSeller(Seller seller) throws Exception;
	Seller getSellerById(Seller seller) throws Exception;
	boolean updateSeller(Seller seller) throws Exception;
	List<Seller> getAllSeller() throws Exception;
}
