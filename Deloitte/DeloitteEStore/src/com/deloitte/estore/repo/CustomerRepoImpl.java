package com.deloitte.estore.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Customer;




public class CustomerRepoImpl implements CustomerRepo {

	@Override
	public boolean addCustomer(Customer customer) throws Exception {
		Connection con = GetDbConnection();
		PreparedStatement ps = con.prepareStatement("insert into customer values (?, ?, ?)");
		ps.setInt(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setString(3, customer.getCustomerLoc());
		
		int r= ps.executeUpdate();
		return (r > 0);
	}

	@Override
	public boolean deleteCustomer(Customer customer) throws Exception {
		Connection con = GetDbConnection();
		PreparedStatement ps = con.prepareStatement("delete from customer where cid = ?");
		ps.setInt(1, customer.getCustomerId());
		
		int r = ps.executeUpdate();
		return (r > 0);
	}

	@Override
	public Customer getCustomerById(Customer customer) throws Exception {
		Connection con = GetDbConnection();
		PreparedStatement ps = con.prepareStatement("select * from customer where cid = ?");
		
		ResultSet r = ps.executeQuery();
		int no = r.getInt(1);
		String name = r.getString(2);
		String loc = r.getString(3);
		
		Customer c = new Customer(no, name, loc);
		return c;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws Exception {
		Connection con = GetDbConnection();
		PreparedStatement ps = con.prepareStatement("update customer set cname =?, cloc =? where cid =?");
		
		ps.setString(1, customer.getCustomerName());
		ps.setString(2, customer.getCustomerLoc());
		ps.setInt(3, customer.getCustomerId());
		
		int r= ps.executeUpdate();
		return (r >0);
	}

	@Override
	public List<Customer> getAllCustomer() throws Exception {
		Connection con =GetDbConnection();
		Statement smt = con.createStatement();
		ResultSet r= smt.executeQuery("select * from customer");
		List<Customer> ls = new ArrayList<>();
		while(r.next()) {
			Customer c = new Customer(r.getInt(1),r.getString(2),r.getString(3));
		ls.add(c);
		}
      return ls;
	}

	
	private Connection GetDbConnection() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:xe", "system", "admin");
		return con;
		
		
	}

}
