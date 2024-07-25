package com.expage.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expage.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
