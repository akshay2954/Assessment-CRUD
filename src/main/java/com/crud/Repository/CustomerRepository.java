package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>  { // entity class name % data type 

}
