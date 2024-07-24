package com.expage.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expage.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
