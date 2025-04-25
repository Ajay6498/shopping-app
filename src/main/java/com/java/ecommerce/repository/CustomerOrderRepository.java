package com.java.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecommerce.dto.Customer;
import com.java.ecommerce.dto.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	List<CustomerOrder> findByCustomerAndPaymentIdIsNotNull(Customer customer);

}
