package com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.dao;

import com.familyfirstsoftware.Spring.Portfolio.Backend.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
