package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.dto.Customer;
import com.ecom.dto.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Integer> {

	List<CustomerOrder> findByCustomerAndPaymentIdIsNotNull(Customer customer);

}