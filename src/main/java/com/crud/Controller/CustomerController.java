package com.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Entity.Customer;
import com.crud.Service.CustomerService;

@RestController
@RequestMapping("/api/customers") //     j
public class CustomerController {
	
	    @Autowired
	    private CustomerService customerService;

	    // Implement CRUD APIs
	    
	

	    @GetMapping
	    public ResponseEntity<List<Customer>> getAllCustomers() {
	        List<Customer> customers = customerService.getAllCustomers();
	        return new ResponseEntity<>(customers, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
	        Customer customer = customerService.getCustomerById(id);
	        return new ResponseEntity<>(customer, HttpStatus.OK);
	    }

	    @PostMapping
	    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
	        Customer createdCustomer = customerService.createCustomer(customer);
	        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
	        Customer updatedCustomer = customerService.updateCustomer(id, customer);
	        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
	        customerService.deleteCustomer(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
