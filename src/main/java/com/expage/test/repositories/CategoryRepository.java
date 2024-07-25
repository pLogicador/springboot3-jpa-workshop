package com.expage.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expage.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
