package com.crud.Service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.Customer;
import com.crud.Repository.CustomerRepository;

@Service
public class CustomerService {
	
	   @Autowired
	    private CustomerRepository customerRepository;

	    // Implement CRUD methods
	   
	   public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }

	    public Customer getCustomerById(Long id) {
	        java.util.Optional<Customer> optionalCustomer = customerRepository.findById(id);
	        return optionalCustomer.orElse(null);
	    }

	    public Customer createCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }

	    public Customer updateCustomer(Long id, Customer updatedCustomer) {
	        java.util.Optional<Customer> optionalCustomer = customerRepository.findById(id);
	        if (optionalCustomer.isPresent()) {
	            Customer existingCustomer = optionalCustomer.get();
	            existingCustomer.setFirstName(updatedCustomer.getFirstName());
	            existingCustomer.setLastName(updatedCustomer.getLastName());
	            // Update other fields as needed
	            return customerRepository.save(existingCustomer);
	        }
	        return null;
	    }

	    public void deleteCustomer(Long id) {
	        customerRepository.deleteById(id);
	    }
	}


