package org.example.collection.factory;

import java.util.Collection;

import org.example.collection.model.Customer;

public interface CustomerFactory {
	
	void createCustomer(Customer customer);
	Collection<Customer> getAllCustomers();
	Customer findByCustomerId(Integer customerId);
	Customer removeByCustomerId(Integer customerId);
}
