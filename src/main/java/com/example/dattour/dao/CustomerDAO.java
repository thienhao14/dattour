package com.example.dattour.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.dattour.model.Customer;

@Repository
public class CustomerDAO {
	
	private static ArrayList<Customer> customers = new ArrayList<>();
	
	public ArrayList<Customer> initListCustomer(){
		customers = new ArrayList<>();
		return customers;
	}
	
	
	public Customer saveCustomer(Customer customer) {
//		customers.add(new Customer(1, "Hào", "HCM", "thienhaodta@gmail.com", "0367751252"));
		customers.add(customer);
		return customer;
	}

}
