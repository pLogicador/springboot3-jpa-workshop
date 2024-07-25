package com.expage.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expage.test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
