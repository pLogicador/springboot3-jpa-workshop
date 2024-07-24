package com.expage.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expage.test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
