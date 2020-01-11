package com.deloitte.estore.repo;


import java.util.List;

import com.deloitte.estore.model.Customer;


public interface CustomerRepo {
	
	boolean addCustomer(Customer customer) throws Exception;
	boolean deleteCustomer(Customer customer) throws Exception;
	Customer getCustomerById(Customer customer) throws Exception;
	boolean updateCustomer(Customer customer) throws Exception;
	List<Customer> getAllCustomer() throws Exception;

}
