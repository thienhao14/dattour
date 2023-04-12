package com.example.dattour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dattour.dao.CustomerDAO;
import com.example.dattour.model.Customer;

@Service
public class CustomerService {	
	@Autowired
	private CustomerDAO customerDAO;
	public Customer saveCustomer(Customer customer) {
		
		return customerDAO.saveCustomer(customer);
	}
}
