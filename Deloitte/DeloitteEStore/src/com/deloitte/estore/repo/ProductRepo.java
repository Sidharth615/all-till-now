package com.deloitte.estore.repo;

import java.sql.Connection;
import java.util.List;

import com.deloitte.estore.model.Product;

public interface ProductRepo {
	
	boolean addProduct(Product product) throws Exception;
	boolean DeleteProduct(Product product) throws Exception;
	Product GetProduct(Product product) throws Exception;
	boolean UpdateProduct(Product product) throws Exception;
	List<Product> GetAllProduct() throws Exception;
	Connection GetDbConnection() throws Exception;

}
